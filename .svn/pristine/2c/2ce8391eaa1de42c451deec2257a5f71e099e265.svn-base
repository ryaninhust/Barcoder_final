package barcode.android.dao.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import barcode.android.dao.BaseDao;

public abstract class BaseDaoImpl implements BaseDao {

	private static SQLiteDatabase db = null;
	
	public static void initContext(Context context) {
		DatabaseOpenHelper.InitDatabaseOpenHelper(context);
	}

	public void beginTransaction(SqliteDatabaseState state) {
		if (state == SqliteDatabaseState.Readable)
			db = DatabaseOpenHelper.Instance.getReadableDatabase();
		else
			db = DatabaseOpenHelper.Instance.getWritableDatabase();
		db.beginTransaction();
	}

	public void setTransactionSuccessful() {
		db.setTransactionSuccessful();
	}

	public void endTransaction() {
		if (null != db)
			db.endTransaction();
		db = null;
	}

	public SQLiteDatabase getDb() {
		return db;
	}
}
