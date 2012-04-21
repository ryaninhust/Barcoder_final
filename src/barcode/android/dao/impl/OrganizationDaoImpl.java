package barcode.android.dao.impl;

import android.content.ContentValues;
import android.database.Cursor;
import barcode.android.dao.OrganizationDao;
import barcode.android.model.Organization;

public class OrganizationDaoImpl extends BaseDaoImpl implements OrganizationDao {

	private static final String TABLE_NAME = "organization";

	public boolean add(Organization org) {
		ContentValues values = new ContentValues();
		values.put("name", org.getName());
		values.put("email", org.getEmail());
		values.put("phone", org.getPhone());
		values.put("qq", org.getQq());
		values.put("abstracts", org.getAbstracts());
		values.put("own", org.isOwn() ? 1 : 0);

		return getDb().insert(TABLE_NAME, null, values) != -1;
	}

	public boolean delete(int id) {
		return getDb().delete(TABLE_NAME, "id=?",
				new String[] { Integer.toBinaryString(id) }) != 0;
	}

	public boolean update(Organization org) {
		ContentValues values = new ContentValues();
		values.put("name", org.getName());
		values.put("email", org.getEmail());
		values.put("phone", org.getPhone());
		values.put("qq", org.getQq());
		values.put("abstracts", org.getAbstracts());
		values.put("own", org.isOwn() ? 1 : 0);

		return getDb().update(TABLE_NAME, values, "id=?",
				new String[] { Integer.toString(org.getId()) }) != 0;
	}

	public Organization query(int id) {
		Cursor c = getDb().query(
				TABLE_NAME,
				new String[] { "id", "name", "email", "qq", "phone",
						"abstracts", "own" }, "id=?",
				new String[] { Integer.toString(id) }, null, null, null);

		Organization org = null;
		if (c.moveToNext()) {
			org = new Organization();
			org.setId(c.getInt(0));
			org.setName(c.getString(1));
			org.setEmail(c.getString(2));
			org.setQq(c.getString(3));
			org.setPhone(c.getString(4));
			org.setAbstracts(c.getString(5));
			org.setOwn(c.getInt(6) == 1 ? true : false);
		}
		c.close();

		return org;
	}
}
