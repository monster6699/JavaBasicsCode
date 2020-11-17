package DataSourceCode;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class demo04 {
    public static void main(String[] args) {
        insertData("java", "技术");
    }

    public static void insertData(String name, String remark) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DruidUntil.getConnection();
            String sql = "insert into admin_role values (null, ?, ?, 1, null, null)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, remark);
            int i = preparedStatement.executeUpdate();
            if (i > 0) {
                System.out.println("添加成功");
            } else {
                System.out.println("添加失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DruidUntil.close(preparedStatement, connection);
        }
    }
}
