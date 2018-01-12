package DBConnecter;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtils {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/books";
    private static final String USER = "zy";
    private static final String PASSWORD = "123456";
    private static Connection conn = null;

    static {
        try {
            //1.加载驱动程序
            Class.forName("com.mysql.jdbc.Driver");
            //2.获得数据库的连接
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //将获得的数据库与java的链接返回（返回的类型为Connection）
    public static Connection getConnection() {
        return conn;
    }

}
