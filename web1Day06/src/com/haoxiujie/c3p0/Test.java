package com.haoxiujie.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException {
        DataSource dataSource = new ComboPooledDataSource();
//        Connection connection = dataSource.getConnection();
//        System.out.println(connection);

        for (int i = 0; i < 11; i++) {
            Connection connection = dataSource.getConnection();
            System.out.println(i + ": " + connection);
        }
    }
}
