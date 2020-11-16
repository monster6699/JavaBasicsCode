package basicJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class demo02 {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://39.106.78.168:3306/monster?characterEncoding=utf-8", "root", "1241340047chen");
             Statement statement = conn.createStatement()) {
            String sql = "insert into admin_role values (null, 'superCode', '超级代码', 1, null, null)";
            int count = statement.executeUpdate(sql);
            if (count > 0) {
                System.out.println("添加成功");
            } else {
                System.out.println("添加失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}
