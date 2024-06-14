package model.connection;

// Đây là chỗ đễ đổi qua CSDL của anh em nghe
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseConnection {

    protected Connection connection;
    public static String DRIVER_NAME = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static String URL = "jdbc:sqlserver://CONGTHANH;databaseName= SWP_Pshop";
    public static String USER_NAME = "admin";
    public static String PASS_WORD = "123";

    public BaseConnection() {
        try {
            // Edit URL , username, password to authenticate with your MS SQL Server
            String url = "jdbc:sqlserver://CONGTHANH;databaseName= SWP_Pshop";
            String username = "admin";
            String password = "123";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException ex) {

            System.out.println(ex);
        }
    }
}
