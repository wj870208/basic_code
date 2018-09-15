package com.haoxiujie.test5;

import com.haoxiujie.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) {
        //获取连接
        Connection connection = JDBCUtils.getConnection();
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement("UPDATE bank SET balance=balance+? WHERE id=?;");
            statement.setInt(1, -500);
            statement.setInt(2, 1);
            statement.executeUpdate();

            statement.setInt(1, 500);
            statement.setInt(2, 2);
            statement.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            JDBCUtils.close(connection, statement);
        }
    }
}
