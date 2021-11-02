package sol;

import java.sql.*;  
   
public class DB {  
  
    public static Connection createNewDatabase(String fileName) {  
    	Connection c=null;
        String url = "jdbc:sqlite:C:/sqlite/" + fileName;  
   
        try {  
            c = DriverManager.getConnection(url);  
            if (c != null) {  
                DatabaseMetaData meta = c.getMetaData();  
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");  
            }  
   
        } catch (Exception e) {  
            return null;
        	//System.out.println(e.getMessage());  
        }  
        return c;
    }
    public static void createNewTable(Connection c,String s) {  
        // SQLite connection string  
        //String url = s;  
          
        // SQL statement for creating a new table  
        String sql = "CREATE TABLE IF NOT EXISTS MOVIES (\n"  
                + " Moive_Name text NOT NULL,\n"  
                + " Actor_Name text NOT NULL,\n"
                + " Actress_Name text NOT NULL,\n"
                + " Year_Of_Release integer NOT NULL,\n"
                + " Director_Name text NOT NULL\n"
                + ");";  
          
        try{  
            //Connection conn = DriverManager.getConnection(url);  
            Statement stmt = c.createStatement();  
            stmt.execute(sql);  
            System.out.println("Table Created");
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }
}  