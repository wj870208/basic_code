package com.haoxiujie.test6;

import com.haoxiujie.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //获取连接
        Connection connection = JDBCUtils.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        ArrayList<Job> alj = new ArrayList<>();
        try {
            statement = connection.prepareStatement("select *  from job");
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                alj.add(new Job(resultSet.getInt("id"), resultSet.getString("jname"), resultSet.getString("description")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(connection, statement, resultSet);
        }

        for (Job job : alj) {
            System.out.println(job);
        }
    }
}
