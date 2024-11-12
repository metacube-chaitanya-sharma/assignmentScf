package assignmnetDbms.com.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import assignmnetDbms.com.jdbc.model.Orders;
import assignmnetDbms.com.jdbc.util.DatabaseConnection;

public class OrderDao {
	
	static Connection con
    = DatabaseConnection.getConnection();
	
	
	public void getAllOrders()
	        throws SQLException
	    {
	 
	        String query
	            = "Select id, orderDate , orderTotal From orders";
	        PreparedStatement ps
	            = con.prepareStatement(query);
	       
	        ResultSet rs = ps.executeQuery();
	        
	        while(rs.next())  
	        	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
	        
	        con.close();
	    }
	
	

}
