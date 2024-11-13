package assignmnetDbms.com.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import assignmnetDbms.com.jdbc.model.Orders;

public class HelperDao implements StoreFrontDao{
	
	public void addImages(Connection con)
	        throws SQLException
	    {
		
	      con.setAutoCommit(false); 
	      Statement stmt=con.createStatement();
	      
	      stmt.addBatch("insert into image(productId, url) values(1, 'https://example.com/headphones.jpg')");  
	      stmt.addBatch("insert into image(productId ,url) values(1, 'https://example.com/topviewheadphones.jpg')");  
	      stmt.addBatch("insert into image(productId, url) values(2, 'https://example.com/topviewlaptop.jpg')");  
	      stmt.addBatch("insert into image(productId, url) values(2, 'https://example.com/laptop.jpg')");  
	        
	     int[] result =  stmt.executeBatch();//executing the batch 
	      con.commit();
	      
	      for(Integer index : result) {
	    	  System.out.println("image is inserted into the database successfully"); 
	      }

	        

	    }

	
	public List<Orders> getAllOrders(Connection con , int shopperId)

	        throws SQLException
	    {
		
		List<Orders> ordersList = new ArrayList<Orders>();
	 
	        
	        PreparedStatement ps
	            = con.prepareStatement("Select id, orderDate , orderTotal From orders "
	            		+ "WHERE shopperId = "+ shopperId + " AND status = 'shipped' "
	            				+ "ORDER BY orderDate ASC");
	        

	       
	        ResultSet result = ps.executeQuery();
	        
	        while(result.next()) { 
	        
	        	Orders orders = new Orders();
	        
	        	orders.setId(result.getInt("id"));
	        	orders.setOrderDate(result.getDate("orderDate"));
	        	orders.setOrderTotal(result.getInt("orderTotal"));
	        	
	        	ordersList.add(orders);
	        	
	      
	        }
	        return ordersList; 
	    }
	
	public int deleteAllProduct(Connection con) throws SQLException{
		
	 PreparedStatement ps = con.prepareStatement("DELETE FROM product p INNER JOIN (SELECT productId "
				+ "FROM orders "
				+ "INNER JOIN orderitem ON orders.id = orderitem.orderId Where "
				+ "orders.orderDate >= curdate() - interval 1 year) "
				+ "o ON p.id = o.productId;");
	 
	ResultSet result =  ps.executeQuery();	
	int numberOfDeletedProduct =0; 
	while(result.next()) {
		numberOfDeletedProduct++; 
	}
	
	
	return numberOfDeletedProduct; 
		
		
	}
	

}
