package assignmnetDbms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class Demo{  
	
 

	Connection con = Database.getInstance().getConnection();
	
	
	  
//    Statement stmt=con.createStatement(); 
    

    String query = "select title, price from product";
    PreparedStatement ps = con.prepareStatement(query);
    
                   
    
    ResultSet rs= ps.executeQuery();  
    
    
//    while(rs.next()) {  
//    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
//    }
    

 
   
} 
 
