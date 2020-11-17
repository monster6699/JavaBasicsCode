package UntilJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class demo03 {
    public static void main(String[] args) {
        boolean b = updatePrice("zhangsan", "lisi", 500);
        if (b) {
            System.out.println("修改成功");
        } else {
            System.out.println("修改失败");
        }
    }

    private static boolean updatePrice(String name1, String name2, float price) {
        Connection connection = null;
        PreparedStatement preparedStatement1 = null;
        PreparedStatement preparedStatement2 = null;
        String sql1 = "update account set price = price - ? where name = ?";
        String sql2 = "update account set price = price + ? where name = ?";
        try {
            connection = JDBCUntil.getConnection();
            //开启事务
            connection.setAutoCommit(false);
            preparedStatement1 = connection.prepareStatement(sql1);
            preparedStatement2 = connection.prepareStatement(sql2);
            preparedStatement1.setDouble(1, price);
            preparedStatement1.setString(2, name1);
            preparedStatement2.setDouble(1, price);
            preparedStatement2.setString(2, name2);

            preparedStatement1.executeUpdate();
//            int a = 1/0;
            preparedStatement2.executeUpdate();
            // 提交事务
            connection.commit();
            return true;
        } catch (Exception e) {
            if (connection != null) {
                try {
                    // 回滚事务
                    connection.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();
        } finally {
            JDBCUntil.close(preparedStatement1, connection);
            JDBCUntil.close(preparedStatement2, null);
        }

        return false;
    }
}
