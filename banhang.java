package banhang;
 
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
 
/**
 * This program demonstrates how to establish database connection to Microsoft
 * SQL Server.
 * @author www.codejava.net
 *
 */
public class banhang {
 
    public static void main(String[] args) {
 
        
            String dbURL = "jdbc:sqlserver://localhost;databaseName=TUTU" ;
            String user = "sa";
            String pass = "007683";
            
            try {
            	Connection connection = DriverManager.getConnection(dbURL, user, pass);
            	
            System.out.println("Ok thế nhở. chơi thêm đồ đi");
            }
            catch (SQLException e) 
            {
            	System.out.println("Huhu không được rồi. bạn ơi đừng chơi đồ nữa");
        }
    }
}
