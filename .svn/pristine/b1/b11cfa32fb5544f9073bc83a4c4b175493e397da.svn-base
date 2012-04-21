package barcode.android.dao.impl;

import android.content.ContentValues;
import android.database.Cursor;
import barcode.android.dao.DormDao;
import barcode.android.dao.UserInfoDao;
import barcode.android.model.Dorm;
import barcode.android.model.UserInfo;

public class UserInfoDaoImpl extends BaseDaoImpl implements UserInfoDao {

	private static final String TABLE_NAME = "userinfo";

	public boolean add(UserInfo info) {
		// 在增加前先行删除，保证数据库中最多只有一个用户
		delete();

		ContentValues values = new ContentValues();
		values.put("uid", info.getUid());
		values.put("name", info.getName());
		values.put("password", info.getPassword());
		values.put("email", info.getEmail());
		values.put("qq", info.getQq());
		values.put("phone", info.getPhone());
		values.put("abstracts", info.getAbstracts());

		if (null != info.getDorm()) {
			// 发现不存在相应的dorm则添加
			DormDao dao = new DormDaoImpl();
			Dorm dorm = dao.query(info.getDorm().getName());
			if (null == dorm) {
				dao.add(info.getDorm());
				dorm = dao.query(info.getDorm().getName());
			}

			values.put("dorm_id", dorm.getId());
		}

		return getDb().insert(TABLE_NAME, null, values) != -1;
	}

	public boolean update(UserInfo info) {
		ContentValues values = new ContentValues();
		values.put("uid", info.getUid());
		values.put("name", info.getName());
		values.put("password", info.getPassword());
		values.put("email", info.getEmail());
		values.put("qq", info.getQq());
		values.put("phone", info.getPhone());
		values.put("abstracts", info.getAbstracts());

		if (null != info.getDorm()) {
			// 判断是否存在相应的dorm，不存在则返回false
			DormDao dao = new DormDaoImpl();
			Dorm dorm = dao.query(info.getDorm().getId());
			if (null == dorm)
				return false;

			values.put("dorm_id", info.getDorm().getId());
		}

		return getDb().update(TABLE_NAME, values, "id=?",
				new String[] { Integer.toString(info.getId()) }) != 0;
	}

	public boolean delete() {
		return getDb().delete(TABLE_NAME, null, null) != 0;
	}

	public UserInfo query() {
		Cursor c = getDb().query(
				TABLE_NAME,
				new String[] { "id", "uid", "name", "password", "email", "qq",
						"phone", "abstracts", "dorm_id" }, null, null, null,
				null, null);

		UserInfo res = null;
		if (c.moveToNext()) {
			int dorm_id = c.getInt(8);
			DormDao dao = new DormDaoImpl();
			Dorm dorm = dao.query(dorm_id);
			if (null != dorm) {
				res = new UserInfo();
				res.setId(c.getInt(0));
				res.setUid(c.getString(1));
				res.setName(c.getString(2));
				res.setPassword(c.getString(3));
				res.setEmail(c.getString(4));
				res.setQq(c.getString(5));
				res.setPhone(c.getString(6));
				res.setAbstracts(c.getString(7));
				res.setDorm(dorm);
			}
		}

		c.close();

		return res;
	}
}
