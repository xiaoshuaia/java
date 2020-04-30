package day01;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.junit.Test;

public class JdbcDemo4 {

	// 需求：向user表 批量插入9999条记录 (每隔500条执行一次 并且清空批处理; 在9850时 制造异常)
	// 向user表 批量插入9999条记录, 每隔500条执行一次 并且清空批处理, 在9850时 制造异常
	@Test
	public void demo4() {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			// 获得连接
			conn = JDBCUtils.GetConnect();
			// 获得发送sql的对象
			String sql = "insert into user values(null,?, ?)";
			pstmt = conn.prepareStatement(sql);
			// 插入9999条记录
			for (int i = 1; i <= 9999; i++) {
				// 设置参数
				pstmt.setString(1, "name" + i);
				pstmt.setString(2, "123");
				// 添加到批处理
				pstmt.addBatch();

				// 每隔500条执行一次 并且清空批处理
				if (i % 500 == 0) {
					// 执行批处理
					pstmt.executeBatch();
					// 清空批处理
					pstmt.clearBatch();
				}

//				// 在9850时 制造异常
//				if (i == 9850) {
//					int j = 1 / 0;
//					System.out.println(j);
//				}
			}

			// 执行批处理
			pstmt.executeBatch();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.release(conn, pstmt);
		}
	}

}
