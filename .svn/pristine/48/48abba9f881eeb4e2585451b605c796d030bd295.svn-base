package barcode.android.dao.impl;

import android.content.ContentValues;
import android.database.Cursor;
import barcode.android.dao.DormDao;
import barcode.android.model.Dorm;

public class DormDaoImpl extends BaseDaoImpl implements DormDao {

	private static final String TABLE_NAME = "dorm";

	public boolean add(Dorm dorm) {
		ContentValues values = new ContentValues();
		values.put("name", dorm.getName());

		return getDb().insert(TABLE_NAME, null, values) != -1;
	}

	public boolean delete(int id) {
		return getDb().delete(TABLE_NAME, "id=?",
				new String[] { Integer.toString(id) }) != 0;
	}

	public boolean update(Dorm dorm) {
		ContentValues values = new ContentValues();
		values.put("name", dorm.getName());

		return getDb().update(TABLE_NAME, values, "id=?",
				new String[] { Integer.toString(dorm.getId()) }) != 0;
	}

	public Dorm query(int id) {
		Cursor c = getDb().query(TABLE_NAME, new String[] { "name" }, "id=?",
				new String[] { Integer.toString(id) }, null, null, null);

		Dorm res = null;
		if (c.moveToNext()) {
			res = new Dorm();
			res.setId(id);
			res.setName(c.getString(0));
		}
		c.close();

		return res;
	}

	public Dorm query(String name) {
		Cursor c = getDb().query(TABLE_NAME, new String[] { "id" }, "name=?",
				new String[] { name }, null, null, null);
		Dorm res = null;
		if (c.moveToNext()) {
			res = new Dorm();
			res.setId(c.getInt(0));
			res.setName(name);
		}
		c.close();

		return res;
	}
}
