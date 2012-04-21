package barcode.android.dao.impl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * 继承SQLiteOpenHelper类，封装对数据库的基本操作
 * 单例模式，使用Instance调用。如DatabaseOpenHelper.Instance.insert();
 * 
 */
class DatabaseOpenHelper extends SQLiteOpenHelper {

	private static final String TAG = "DatabaseOpenHelper";

	private static final String DATABASE_NAME = "barcode";
	private static final int DATABASE_VERSION = 2;

	public static DatabaseOpenHelper Instance;

	/**
	 * 禁止实例化
	 */
	private DatabaseOpenHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	/**
	 * 使用此方法实例化Instance
	 */
	public static void InitDatabaseOpenHelper(Context context) {
		Instance = new DatabaseOpenHelper(context);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		try {
			createTables(db);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		Log.d(TAG, "onUpgrade: upgrade database from version " + oldVersion
				+ " to version " + newVersion);

		try {
			dropTables(db);
		} catch (Exception e) {
			e.printStackTrace();
		}
		onCreate(db);
	}

	private void createTables(SQLiteDatabase db) throws ClassNotFoundException,
			IllegalArgumentException, IllegalAccessException,
			InvocationTargetException {
		Class<?> c = Class.forName("barcode.android.dao.impl.SqlStatement");
		Method[] methods = c.getDeclaredMethods();
		final String createTablePrefix = "getCreateTable";
		for (Method m : methods) {
			if (m.getName().length() > createTablePrefix.length()
					&& m.getName().substring(0, createTablePrefix.length())
							.equals(createTablePrefix)) {
				String sql = (String) m.invoke(c, new Object[] {});

				Log.d(TAG, sql);

				db.execSQL(sql);
			}
		}
	}

	private void dropTables(SQLiteDatabase db) throws ClassNotFoundException,
			IllegalArgumentException, IllegalAccessException,
			InvocationTargetException {
		Class<?> c = Class.forName("barcode.android.dao.impl.SqlStatement");
		Method[] methods = c.getDeclaredMethods();
		final String createTablePrefix = "getCreateTable";
		for (Method m : methods) {
			if (m.getName().length() > createTablePrefix.length()
					&& m.getName().substring(0, createTablePrefix.length())
							.equals(createTablePrefix)) {
				String tableName = m.getName().substring(
						createTablePrefix.length(), m.getName().length());
				String sql = SqlStatement.getDropTable()
						+ tableName.toLowerCase();

				Log.d(TAG, sql);

				db.execSQL(sql);
			}
		}
	}
}
