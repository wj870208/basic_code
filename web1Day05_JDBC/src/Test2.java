import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test2 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (
                //从驱动管理中获得一个数据库连接，参数为地址、用户名、密码
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbtest", "root", "root");
                //从数据库连接中创建一个“语句“：用来执行SQL语句的对象
                Statement statement = connection.createStatement()) {
            //语句对象执行更新，参数为语句，返回值是受影响的行数
            int i = statement.executeUpdate("insert into dept values (12,'测试部','郑州')");
            System.out.println(i);
            if (i > 0) {
                System.out.println("添加成功");
            } else {
                System.out.println("添加失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
