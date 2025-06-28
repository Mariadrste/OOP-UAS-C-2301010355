package perpustakaan_pribadi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author LAB F
 */
public class dbkoneksi {
    static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static String DB_URL = "jdbc:mysql://localhost/perpustakaan_pribadi";
    static String DB_USER = "root";
    static String DB_PASS = "";

    public static Connection koneksi() {
        try {
            Class.forName(JDBC_DRIVER);
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        } catch (ClassNotFoundException | SQLException err) {
            System.out.println("Gagal Koneksi Ke DBMS MySQL");
            err.printStackTrace();
        }
        return null;
    }
    
    
}
