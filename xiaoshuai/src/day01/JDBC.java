package day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class JDBC {

	


 public static void main(String[] args) throws Exception  {
	        // ����: ��ѯuser������м�¼
			// ע������: ȷ��ʹ���ĸ����ݿ�
//			Class.forName("com.mysql.jdbc.Driver");
//			// ��ȡ����: �ĸ����� �ĸ���� �ĸ����ݲֿ�
//			String url = "jdbc:mysql://localhost:3306/mydb3";
//			// �ṩ���ݿ���˺ź�����
//			String user = "root";
//			String password = "mysql";
			Connection conn = JDBCUtils.GetConnect();
			// ��� ����sql���Ķ���
			String sql = "select * from student";
			Statement stmt = conn.prepareStatement(sql);
			// ����sql ���ؽ��
	
			ResultSet rs = stmt.executeQuery(sql);
			// ������
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String pwd = rs.getString("age");

				System.out.println(id + ":::" + name + ":::" + pwd);
			}
			// �ͷ���Դ
			JDBCUtils.release(conn, stmt, rs);;
 }
}
