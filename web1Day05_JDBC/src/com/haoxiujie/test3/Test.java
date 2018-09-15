package com.haoxiujie.test3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection connection = DriverManager.getConnection("jdbc:mysql:///dbtest", "root", "root");
             Statement statement = connection.createStatement()) {
            String sql = "update dept set loc='北京' where dname='1部'";
            int i = statement.executeUpdate(sql);
            System.out.println(i);
            if (i > 0) {
                System.out.println("执行成功");
            } else {
                System.out.println("执行失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
