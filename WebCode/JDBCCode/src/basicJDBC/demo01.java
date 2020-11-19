package basicJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class demo01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://39.106.78.168:3306/monster?characterEncoding=utf-8", "root", "1241340047chen");
        // 定义sql语句
        String sql = "update admin_role set remark = '哈哈' where id = 15";
        // 获取执行sql对象Statement
        Statement statement = conn.createStatement();
        // 执行sql语句
        int i = statement.executeUpdate(sql);
        System.out.println(i);
        statement.close();
        conn.close();
    }
}
