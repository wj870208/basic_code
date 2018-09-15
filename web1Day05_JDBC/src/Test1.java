import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");//注册驱动
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbtest", "root", "root");
        String sql = "update dept set loc='杭州' where id=10";
        Statement statement = connection.createStatement();
        int i = statement.executeUpdate(sql);
        System.out.println(i);
        statement.close();
        connection.close();
    }
}
