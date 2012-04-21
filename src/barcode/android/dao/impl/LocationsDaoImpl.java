package barcode.android.dao.impl;

import android.content.ContentValues;
import android.database.Cursor;
import barcode.android.dao.LocationsDao;
import barcode.android.model.Locations;

public class LocationsDaoImpl extends BaseDaoImpl implements LocationsDao {

	private static final String TABLE_NAME = "locations";

	public boolean add(Locations location) {
		ContentValues values = new ContentValues();
		values.put("name", location.getName());
		values.put("x", location.getX());
		values.put("y", location.getY());

		return getDb().insert(TABLE_NAME, null, values) != -1;
	}

	public boolean delete(int id) {
		return getDb().delete(TABLE_NAME, "id=?",
				new String[] { Integer.toString(id) }) != 0;
	}

	public boolean update(Locations location) {
		ContentValues values = new ContentValues();
		values.put("name", location.getName());
		values.put("x", location.getX());
		values.put("y", location.getY());

		return getDb().update(TABLE_NAME, values, "id=?",
				new String[] { Integer.toString(location.getId()) }) != 0;
	}

	public Locations query(int id) {
		Cursor c = getDb()
				.query(TABLE_NAME, new String[] { "name", "x", "y" }, "id=?",
						new String[] { Integer.toString(id) }, null, null, null);
		
		Locations res = null;
		if (c.moveToNext()){
			res = new Locations();
			res.setId(id);
			res.setName(c.getString(0));
			res.setX(c.getDouble(1));
			res.setY(c.getDouble(2));
		}
		c.close();
		
		return res;
	}
}
