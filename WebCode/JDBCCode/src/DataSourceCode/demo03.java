package DataSourceCode;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class demo03 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        InputStream resourceAsStream = demo03.class.getClassLoader().getResourceAsStream("druid.properties");
        if (resourceAsStream != null) {
            properties.load(resourceAsStream);
            DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
            Connection connection = dataSource.getConnection();
            System.out.println(connection);
            String sql = "select * from admin_role";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }
            statement.close();
            connection.close();
        }

    }
}
