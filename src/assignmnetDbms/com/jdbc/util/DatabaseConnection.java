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

    public static  Connection getConnection() {

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
        else {
        	try {
        	con.close();
        	}
        	catch(SQLException ex) {
        		System.out.println(ex.getMessage());
        	}
        }

        return con;
    }
    
    
    /*
     * try(con = DriverManager.getConnection( host, username, password )){
     * }
     * catch(SQLException e){
     * System.out.println(e.getMessage()); 
     * }
     * 
     *  there is no need of finally block because it close the connection automatically 
     *
     * */
     */
	
	
}
