package sol;

import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;  
   
public class C{  
     /** 
     * Connect to a sample database 
     */  
    public static Connection connect(String s) {  
        Connection conn = null;  
        try {  
            // db parameters  
        	//Class.forName("org.sqlite.JDBC");
            //String url = "jdbc:sqlite:/C:\\sqlite\\test.db";  
            // create a connection to the database  
            conn = DriverManager.getConnection(s);  
           //conn = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established.");  
            return conn;  
        } catch (Exception e) {  
            return null;
        	//System.out.println(e.getMessage());  
        }
    }  
    /** 
     * @param args the command line arguments 
     */  
}  