package com.haoxiujie.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtils_C3P0 {
    /**
     * JDBC工具类，采用c3p0连接池
     */

    //初始化工具类
    private static DataSource dataSource;

    static {
        dataSource = new ComboPooledDataSource();
    }

    //获取连接
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    //归还连接
    public static void close(ResultSet resultSet, Statement statement, Connection connection) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        close(statement, connection);
    }

    private static void close(Statement statement, Connection connection) {
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

    //获取连接
    public static DataSource getDataSource() {
        return dataSource;
    }
}
