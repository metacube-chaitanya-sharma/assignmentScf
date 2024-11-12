package assignmnetDbms.com.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

 
public class DatabaseConnection {
 
	private static DatabaseConnection dbIsntance;
    private static Connection con ;
   


    private DatabaseConnection() {
      // private constructor //
    }

    public static DatabaseConnection getInstance(){
    	
    if(dbIsntance==null){
        dbIsntance= new DatabaseConnection();
    }
    return dbIsntance;
    }

    public static  Connection getConnection(){

        if(con==null){
            try {
                String host = "jdbc:mysql://localhost:3306/storeFront";
                String username = "root";
                String password = "root";
                con = DriverManager.getConnection( host, username, password );
                
                
                } 
            catch (SQLException ex) {
            	
            
               System.out.println(ex.getMessage()); 
            } 
            
            
        }

        return con;
    }
}
