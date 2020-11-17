package DataSourceCode;
import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class demo01 {
    public static void main(String[] args) {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        Connection connection = null;
        String sql = "select * from admin_role";
        Statement statement = null;
        try {
            connection = comboPooledDataSource.getConnection();
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
