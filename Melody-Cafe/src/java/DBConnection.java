
import java.sql.*;

public class DBConnection {
// JDBC driver name and database URL

    static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
    static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";

    //  Database credentials
    static final String USER = "MELODY";
    static final String PASS = "admin123";
     static Connection con = null;

    public static Connection connMethod() throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER);
        
        con = DriverManager.getConnection(DB_URL, USER, PASS);
        
        
        return con;
    }
}
