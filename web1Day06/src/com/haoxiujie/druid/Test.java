package com.haoxiujie.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        InputStream is = Test.class.getClassLoader().getResourceAsStream("druid.properties");
        properties.load(is);
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
//        for (int i = 0; i < 11; i++) {
//            Connection connection = dataSource.getConnection();
//            System.out.println(i + ": " + connection);
//        }
        PreparedStatement statement = connection.prepareStatement("select * from tb where id=?");
        statement.setInt(1, 2);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            // id   price  name       newdate          a
            int id = resultSet.getInt("id");
            double price = resultSet.getDouble("price");
            String name = resultSet.getString("name");
            Date date = resultSet.getDate("newdate");
            int a = resultSet.getInt("a");
            System.out.println(id + " " + price + " " + name + " " + date + " " + a);
        }
        connection.close();
    }
}
