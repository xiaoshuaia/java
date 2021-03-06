package day01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JDBCUtilsC3p0 {
	// 实例化C3P0连接池
	static ComboPooledDataSource cpds = new ComboPooledDataSource();

	// 获得连接
	public static Connection getConnection() throws Exception {
		// 获得连接
		Connection conn = cpds.getConnection();
		return conn;
	}

	// 释放资源
	public static void release(Connection conn, Statement stmt, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		rs = null;

		release(conn, stmt);
	}

	// 释放资源
	public static void release(Connection conn, Statement stmt) {
		try {
			if (stmt != null) {
				stmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		stmt = null;

		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conn = null;
	}

}
