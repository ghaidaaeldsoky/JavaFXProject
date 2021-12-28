
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class DatabaseConnection {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "ghaidaa1";
    
    private static final String URL = "jdbc:mysql://localhost:3307/fxsystem";
    private static Connection connection = null;
    
    // Connection With DataBaseConnection
    public static Connection connect() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(
                     URL, USERNAME, PASSWORD);
                     System.out.print("Connect");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
         return connection;
    }

}
