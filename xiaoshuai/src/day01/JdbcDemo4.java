package day01;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.junit.Test;

public class JdbcDemo4 {

	// ������user�� ��������9999����¼ (ÿ��500��ִ��һ�� �������������; ��9850ʱ �����쳣)
	// ��user�� ��������9999����¼, ÿ��500��ִ��һ�� �������������, ��9850ʱ �����쳣
	@Test
	public void demo4() {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			// �������
			conn = JDBCUtils.GetConnect();
			// ��÷���sql�Ķ���
			String sql = "insert into user values(null,?, ?)";
			pstmt = conn.prepareStatement(sql);
			// ����9999����¼
			for (int i = 1; i <= 9999; i++) {
				// ���ò���
				pstmt.setString(1, "name" + i);
				pstmt.setString(2, "123");
				// ��ӵ�������
				pstmt.addBatch();

				// ÿ��500��ִ��һ�� �������������
				if (i % 500 == 0) {
					// ִ��������
					pstmt.executeBatch();
					// ���������
					pstmt.clearBatch();
				}

//				// ��9850ʱ �����쳣
//				if (i == 9850) {
//					int j = 1 / 0;
//					System.out.println(j);
//				}
			}

			// ִ��������
			pstmt.executeBatch();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.release(conn, pstmt);
		}
	}

}
