package barcode.android.dao;

import barcode.android.model.Locations;

public interface LocationsDao extends BaseDao {
	public boolean add(Locations location);

	public boolean delete(int id);

	public boolean update(Locations location);

	public Locations query(int id);
}
