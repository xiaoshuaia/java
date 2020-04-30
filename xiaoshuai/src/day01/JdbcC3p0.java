package day01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcC3p0 {
	@Test
	public void demo2() throws Exception {
		// ComboPooledDataSource cpds = new ComboPooledDataSource("day07");
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			// �����ӳ� �������
			// conn = cpds.getConnection();
			conn = JDBCUtilsC3p0.getConnection();
			// ��÷���sql�Ķ���
			String sql = "select * from user";
			stmt = conn.prepareStatement(sql);
			// ����sql ��ý��
			rs = stmt.executeQuery();
			// ������
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");

				System.out.println(id + "::::" + name + "::::" + age);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// �ͷ���Դ
			JDBCUtils.release(conn, stmt, rs);
		}
	}

}
