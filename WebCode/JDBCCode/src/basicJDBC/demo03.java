package basicJDBC;

import java.sql.*;

public class demo03 {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://39.106.78.168:3306/monster?characterEncoding=utf-8", "root", "1241340047chen");
             Statement statement = conn.createStatement()) {
            String sql = "select * from admin_role";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String remark = resultSet.getString(3);
                int status = resultSet.getInt("status");
                Date create_time = resultSet.getDate("create_time");
                System.out.println(id + "," + name + "," + remark + "," + status + "," + create_time);
            }
            resultSet.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}
