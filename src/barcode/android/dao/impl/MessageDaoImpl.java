package barcode.android.dao.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import android.content.ContentValues;
import android.database.Cursor;
import barcode.android.dao.MessageDao;
import barcode.android.dao.OrganizationDao;
import barcode.android.dao.UserInfoDao;
import barcode.android.model.Message;
import barcode.android.model.MessageStatus;
import barcode.android.model.Organization;
import barcode.android.model.Unit;
import barcode.android.model.UserInfo;

public class MessageDaoImpl extends BaseDaoImpl implements MessageDao {

	private static final String TABLE_NAME = "messages";

	private static SimpleDateFormat df = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");

	public boolean add(Message msg) {
		ContentValues values = new ContentValues();
		values.put("sender_id", msg.getSender().getId());
		values.put("receiver_id", msg.getReceiver().getId());
		values.put("sender_type",
				msg.getSender().getClass() == UserInfo.class ? 1 : 0);
		values.put("receiver_type",
				msg.getReceiver().getClass() == UserInfo.class ? 1 : 0);
		values.put("status", msg.getStatus() == MessageStatus.Readed ? 1 : 0);
		values.put("content", msg.getContent());
		String time = df.format(msg.getTime().getTime());
		values.put("time", time);

		if (checkUnitExist(msg.getSender().getClass(), msg.getSender().getId())
				&& checkUnitExist(msg.getReceiver().getClass(), msg
						.getReceiver().getId()))
			return getDb().insert(TABLE_NAME, null, values) != -1;
		else
			return false;
	}

	public boolean delete(int id) {
		return getDb().delete(TABLE_NAME, "id=?",
				new String[] { Integer.toString(id) }) != 0;
	}

	public boolean update(Message msg) {
		ContentValues values = new ContentValues();
		values.put("sender_id", msg.getSender().getId());
		values.put("receiver_id", msg.getReceiver().getId());
		values.put("sender_type",
				msg.getSender().getClass() == UserInfo.class ? 1 : 0);
		values.put("receiver_type",
				msg.getReceiver().getClass() == UserInfo.class ? 1 : 0);
		values.put("status", msg.getStatus() == MessageStatus.Readed ? 1 : 0);
		values.put("content", msg.getContent());
		String time = df.format(msg.getTime().getTime());
		values.put("time", time);

		if (checkUnitExist(msg.getSender().getClass(), msg.getSender().getId())
				&& checkUnitExist(msg.getReceiver().getClass(), msg
						.getReceiver().getId()))
			return getDb().update(TABLE_NAME, values, "id=?",
					new String[] { Integer.toString(msg.getId()) }) != 0;
		else
			return false;
	}

	public Message query(int id) {
		Cursor c = getDb().query(
				TABLE_NAME,
				new String[] { "id", "sender_id", "receiver_id", "sender_type",
						"receiver_type", "status", "content", "time" }, "id=?",
				new String[] { Integer.toString(id) }, null, null, null);

		Message res = null;
		if (c.moveToNext()) {
			res = new Message();
			res.setId(c.getInt(0));
			res.setSender(queryUnit(c.getInt(3), c.getInt(1)));
			res.setReceiver(queryUnit(c.getInt(4), c.getInt(2)));
			res.setStatus(c.getInt(5) == 1 ? MessageStatus.Readed
					: MessageStatus.UnReaded);
			res.setContent(c.getString(6));

			Calendar cal = Calendar.getInstance();
			try {
				cal.setTime(df.parse(c.getString(7)));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			res.setTime(cal);
		}

		c.close();

		if (res.getSender() == null || res.getReceiver() == null)
			return null;
		return res;
	}

	private boolean checkUnitExist(Class<? extends Unit> c, int id) {
		if (UserInfo.class == c) {
			UserInfoDao dao = new UserInfoDaoImpl();
			UserInfo info = dao.query();
			if (null != info && info.getId() == id)
				return true;
		} else {
			OrganizationDao dao = new OrganizationDaoImpl();
			Organization org = dao.query(id);
			if (null != org)
				return true;
		}

		return false;
	}

	private Unit queryUnit(int type, int id) {
		if (1 == type) {
			UserInfoDao dao = new UserInfoDaoImpl();
			return dao.query();
		} else {
			OrganizationDao dao = new OrganizationDaoImpl();
			return dao.query(id);
		}
	}
}
