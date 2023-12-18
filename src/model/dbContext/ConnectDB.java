package model.dbContext;

import java.sql.*;

public class ConnectDB implements BaseConnection {
	private static ConnectDB instance;

	public ConnectDB() {

	}

	public static ConnectDB getInstance() {
		if (instance == null) {
			instance = new ConnectDB();
		}
		return instance;
	}
	
	// Open Connection
	public Connection openConnection() throws Exception {
		Class.forName(DRIVE_NAME);
		Connection con = DriverManager.getConnection(URL,USER_NAME,PASS_WORD);
		
		return con;
	}
	
	// Close Connection with no Result Set
	public void closeConnect(Connection con, PreparedStatement pst) throws Exception {
		try {
			con.close();
			pst.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	// Close Connection with have Result Set
	public void closeConnect(Connection con, PreparedStatement pst, ResultSet rs) throws Exception {
		try {
			con.close();
			pst.close();
			rs.close();
		} catch (SQLException e) {
			
		}
	}
}
