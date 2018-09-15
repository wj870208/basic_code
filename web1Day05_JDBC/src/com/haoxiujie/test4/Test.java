package com.haoxiujie.test4;

import java.sql.*;

public class Test {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dbtest", "root", "root");
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("select * from job");
            System.out.println("id\t|\tjname\t|\tdescription");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String jname = resultSet.getString("jname");
                String description = resultSet.getString("description");
                System.out.println(id + "\t|\t" + jname + "\t |\t" + description);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
