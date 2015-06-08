package mallspot.persistance.repository.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {
	private String url = "jdbc:postgresql://localhost:5433/store";
	private Connection dbh;
	public static final String MALLS_TABLE = "malls";
	public static final String USERS_TABLE = "users";

	public static final String COLUMN_CREATED_AT = "createdat";
	public static final String COLUMN_MODIFIED_AT = "modifiedat";
	public static final String COLUMN_CREATED_BY = "createdby";
	public static final String COLUMN_MODIFIED_BY = "modifiedby";

	public synchronized boolean startConection() {
		try {
			if (dbh == null) {
				dbh = DriverManager.getConnection(url, "postgres", "canada");
				return true;
			}
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public synchronized boolean closeConection() {
		try {
			dbh.close();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public Connection getConnection() {
		return dbh;
	}

}
