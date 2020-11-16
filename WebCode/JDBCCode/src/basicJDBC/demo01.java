package basicJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class demo01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://39.106.78.168:3306/monster?characterEncoding=utf-8", "root", "1241340047chen");
        String sql = "update admin_role set remark = '哈哈' where id = 15";
        Statement statement = conn.createStatement();
        int i = statement.executeUpdate(sql);
        System.out.println(i);
        statement.close();
        conn.close();

    }
}
