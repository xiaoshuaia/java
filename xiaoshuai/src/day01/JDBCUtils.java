package day01;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.ResultSet;

public class JDBCUtils {
	static String driverClass = null;
	static String url = null;
	static String user = null;
	static String password = null;

	static {
		// ��������ļ��е�����
		Properties prop = new Properties();
		try {

			InputStream in = JDBCUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
			prop.load(in);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		driverClass = prop.getProperty("driverClass");
		url = prop.getProperty("url");
		user = prop.getProperty("user");
		password = prop.getProperty("password");

		try {
			Class.forName(driverClass);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connection GetConnect() throws Exception {
		Connection conn = DriverManager.getConnection(url, user, password);
		return conn;
	}

	// �ͷ���Դ
		public static void release(Connection conn, Statement stmt, java.sql.ResultSet rs) {
			// �ͷ���Դ
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			rs = null;

			release(conn, stmt);
		}

		// �ͷ���Դ
		public static void release(Connection conn, Statement stmt) {
			// �ͷ���Դ
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			stmt = null;

			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			conn = null;
		}

}
