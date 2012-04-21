package barcode.android.dao.impl;

/**
 * 定义对数据库操作的SQL语句
 * 
 */
class SqlStatement {
	// 禁止实例化此类
	private SqlStatement() {
	}

	private static final String dropTable = "DROP TABLE IF EXISTS ";

	private static final String createTableActiveties = "CREATE TABLE \"activeties\" ("
			+ "\"id\" INTEGER NOT NULL,"
			+ "\"first_org\" INTEGER,"
			+ "\"second_org\" INTEGER,"
			+ "\"third_org\" INTEGER,"
			+ "\"first_ensure\" INTEGER,"
			+ "\"second_ensure\" INTEGER,"
			+ "\"third_ensure\" INTEGER,"
			+ "\"validity\" TEXT,"
			+ "\"location\" INTEGER,"
			+ "\"abstracts\" TEXT,"
			+ "\"act_date\" TEXT," + "\"statues\" INTEGER" + ")";

	private static final String createTableDorm = "CREATE TABLE \"dorm\" ("
			+ "\"id\" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,"
			+ "\"name\" TEXT" + ")";

	private static final String createTableLocations = "CREATE TABLE \"locations\" ("
			+ "\"id\" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,"
			+ "\"name\" TEXT," + "\"x\" REAL," + "\"y\" REAL" + ")";

	private static final String createTableOrganization = "CREATE TABLE \"organization\" ("
			+ "\"id\" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,"
			+ "\"name\" TEXT,"
			+ "\"email\" TEXT,"
			+ "\"qq\" TEXT,"
			+ "\"phone\" TEXT,"
			+ "\"abstracts\" TEXT,"
			+ "\"own\" INTEGER"
			+ ")";

	private static final String createTableUserInfo = "CREATE TABLE \"userinfo\" ("
			+ "\"id\" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,"
			+ "\"uid\" TEXT NOT NULL,"
			+ "\"name\" TEXT NOT NULL,"
			+ "\"password\" TEXT,"
			+ "\"email\" TEXT,"
			+ "\"qq\" TEXT,"
			+ "\"phone\" TEXT,"
			+ "\"abstracts\" TEXT," + "\"dorm_id\" INTEGER" + ")";

	private static final String createTableMessages = "CREATE TABLE \"messages\" ("
			+ "\"id\" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,"
			+ "\"sender_id\" INTEGER NOT NULL,"
			+ "\"receiver_id\" INTEGER NOT NULL,"
			+ "\"sender_type\" INTEGER DEFAULT (0),"
			+ "\"receiver_type\" INTEGER DEFAULT (0),"
			+ "\"status\" INTEGER DEFAULT (0),"
			+ "\"content\" TEXT,"
			+ "\"time\" TEXT" + ")";

	public static String getDropTable() {
		return dropTable;
	}

	public static String getCreateTableActiveties() {
		return createTableActiveties;
	}

	public static String getCreateTableDorm() {
		return createTableDorm;
	}

	public static String getCreateTableLocations() {
		return createTableLocations;
	}

	public static String getCreateTableOrganization() {
		return createTableOrganization;
	}

	public static String getCreateTableUserInfo() {
		return createTableUserInfo;
	}

	public static String getCreateTableMessages() {
		return createTableMessages;
	}
}
