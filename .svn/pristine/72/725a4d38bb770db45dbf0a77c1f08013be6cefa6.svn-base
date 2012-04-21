package barcode.android.dao.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import android.content.ContentValues;
import android.database.Cursor;
import barcode.android.dao.ActivityDao;
import barcode.android.dao.LocationsDao;
import barcode.android.dao.OrganizationDao;
import barcode.android.model.Activity;
import barcode.android.model.Locations;
import barcode.android.model.Organization;

public class ActivityDaoImpl extends BaseDaoImpl implements ActivityDao {

	private static final String TABLE_NAME = "activeties";

	private static SimpleDateFormat df = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");

	public boolean add(Activity activity) {
		if (activity.getOrg1() == null || activity.getOrg2() == null
				|| activity.getOrg3() == null)
			return false;

		ContentValues values = new ContentValues();
		values.put("first_org", activity.getOrg1().getId());
		values.put("second_org", activity.getOrg2().getId());
		values.put("third_org", activity.getOrg3().getId());
		values.put("first_ensure", activity.isEnsure1());
		values.put("second_org", activity.isEnsure2());
		values.put("third_ensure", activity.isEnsure3());
		values.put("validity", df.format(activity.getValidity().getTime()));
		values.put("abstracts", activity.getAbstracts());
		values.put("act_date", df.format(activity.getActDate().getTime()));
		values.put("statues", Activity.getStatusNumber(activity.getStatus()));

		return getDb().insert(TABLE_NAME, null, values) != -1;
	}

	public boolean delete(int id) {
		return getDb().delete(TABLE_NAME, "id=?",
				new String[] { Integer.toString(id) }) != 0;
	}

	public boolean update(Activity activity) {
		if (activity.getOrg1() == null || activity.getOrg2() == null
				|| activity.getOrg3() == null)
			return false;

		ContentValues values = new ContentValues();
		values.put("first_org", activity.getOrg1().getId());
		values.put("second_org", activity.getOrg2().getId());
		values.put("third_org", activity.getOrg3().getId());
		values.put("first_ensure", activity.isEnsure1());
		values.put("second_org", activity.isEnsure2());
		values.put("third_ensure", activity.isEnsure3());
		values.put("validity", df.format(activity.getValidity().getTime()));
		values.put("abstracts", activity.getAbstracts());
		values.put("act_date", df.format(activity.getActDate().getTime()));
		values.put("statues", Activity.getStatusNumber(activity.getStatus()));

		return getDb().update(TABLE_NAME, values, "id=?",
				new String[] { Integer.toString(activity.getId()) }) != 0;
	}

	public Activity query(int id) {

		Cursor c = getDb().query(
				TABLE_NAME,
				new String[] { "id", "first_org", "second_org", "third_org",
						"first_ensure", "second_ensure", "third_ensure",
						"validity", "location", "abstracts", "act_date",
						"status" }, "id=?",
				new String[] { Integer.toString(id) }, null, null, null);

		Activity res = null;
		if (c.moveToNext()) {
			res = new Activity();
			res.setId(c.getInt(0));
			OrganizationDao daoOrg = new OrganizationDaoImpl();
			Organization org1 = daoOrg.query(c.getInt(1));
			Organization org2 = daoOrg.query(c.getInt(2));
			Organization org3 = daoOrg.query(c.getInt(3));
			if (null != org1 && null != org2 && null != org3) {
				res.setOrg1(org1);
				res.setOrg2(org2);
				res.setOrg3(org3);
				res.setEnsure1(c.getInt(4) == 1 ? true : false);
				res.setEnsure2(c.getInt(5) == 1 ? true : false);
				res.setEnsure3(c.getInt(6) == 1 ? true : false);
				Calendar cal = Calendar.getInstance();
				try {
					cal.setTime(df.parse(c.getString(7)));
				} catch (ParseException e) {
					e.printStackTrace();
				}
				res.setValidity(cal);

				LocationsDao daoLoc = new LocationsDaoImpl();
				Locations loc = daoLoc.query(c.getInt(8));
				if (null != loc) {
					res.setLocation(loc);
					res.setAbstracts(c.getString(9));

					cal = Calendar.getInstance();
					try {
						cal.setTime(df.parse(c.getString(10)));
					} catch (ParseException e) {
						e.printStackTrace();
					}
					res.setActDate(cal);

					res.setStatus(Activity.getStatus(c.getInt(11)));
				} else
					res = null;
			} else
				res = null;
		}

		return res;
	}
}
