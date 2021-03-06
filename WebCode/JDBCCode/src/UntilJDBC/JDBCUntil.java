package UntilJDBC;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

public class JDBCUntil {
    private static String user;
    private static String url;
    private static String password;

    static {
        // 获取当前文件的自解码
        Class<JDBCUntil> jdbcUntilClass = JDBCUntil.class;
        ClassLoader classLoader = jdbcUntilClass.getClassLoader();
        URL resource = classLoader.getResource("jdbc.properties");
        assert resource != null;
        // 获取配置文件路径
        String path = resource.getPath();
        Properties properties = new Properties();
        try {
            properties.load(new FileReader(path));
            String driver = properties.getProperty("Driver");
            user = properties.getProperty("user");
            url = properties.getProperty("url");
            password = properties.getProperty("password");
            Class.forName(driver);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;

    }
    // 关闭连接
    public static void close(Statement statement, Connection connection) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // 关闭连接
    public static void close(ResultSet resultSet, Statement statement, Connection connection) {
        System.out.println(resultSet);
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


}
