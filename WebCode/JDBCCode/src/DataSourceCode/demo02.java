package DataSourceCode;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class demo02 {
    public static void main(String[] args) throws SQLException {
        getC3p0DefaultConfig();
        System.out.println("---------------------");
        getC3poOtherConfig();

    }

    public static void getC3p0DefaultConfig() throws SQLException {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        for (int i = 0; i < 10; i++) {
            Connection connection = comboPooledDataSource.getConnection();
            System.out.println(connection);
        }

    }


    public static void getC3poOtherConfig() throws SQLException {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource("otherc3p0");
        for (int i = 0; i < 5; i++) {
            Connection connection = comboPooledDataSource.getConnection();
            System.out.println(connection);
        }
    }
}
