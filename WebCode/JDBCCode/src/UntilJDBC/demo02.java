package UntilJDBC;

import java.sql.*;

public class demo02 {
    public static void main(String[] args) {
        boolean user = login2("user", "123456");
        if(user){
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }

    }

    public static boolean login(String username, String password) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCUntil.getConnection();
            statement = connection.createStatement();
            String sql = "select * from test where username='" + username + "' and password='" + password + "'";
            resultSet = statement.executeQuery(sql);
            return resultSet.next();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUntil.close(resultSet, statement, connection);
        }

        return false;
    }

    //preparedStatement实现登录
    public static boolean login2(String username, String password) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCUntil.getConnection();
            String sql = "select * from test where username = ? and password = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUntil.close(resultSet, preparedStatement, connection);
        }

        return false;
    }
}
