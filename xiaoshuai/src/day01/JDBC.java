package day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class JDBC {

	


 public static void main(String[] args) throws Exception  {
	        // 需求: 查询user表的所有记录
			// 注册驱动: 确定使用哪个数据库
//			Class.forName("com.mysql.jdbc.Driver");
//			// 获取连接: 哪个电脑 哪个软件 哪个数据仓库
//			String url = "jdbc:mysql://localhost:3306/mydb3";
//			// 提供数据库的账号和密码
//			String user = "root";
//			String password = "mysql";
			Connection conn = JDBCUtils.GetConnect();
			// 获得 发送sql语句的对象
			String sql = "select * from student";
			Statement stmt = conn.prepareStatement(sql);
			// 发送sql 返回结果
	
			ResultSet rs = stmt.executeQuery(sql);
			// 处理结果
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String pwd = rs.getString("age");

				System.out.println(id + ":::" + name + ":::" + pwd);
			}
			// 释放资源
			JDBCUtils.release(conn, stmt, rs);;
 }
}
