package assignmnetDbms.com.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import assignmnetDbms.com.jdbc.model.Category;
import assignmnetDbms.com.jdbc.model.Orders;

public class HelperDao implements StoreFrontDao{
	
	
	/**
	 * Given the id of a user, fetch all orders (Id, Order Date, Order Total) 
	 * of that user which are in shipped state
	 */
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
	
	
	
	/**
	 * Insert five or more images of a product using batch insert technique
	 */
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

	

	/**
	 * Delete all those products which were not ordered by any Shopper in last 1 year
	 */
	public int deleteAllProduct(Connection con) throws SQLException{
		
	 
	 PreparedStatement ps = con.prepareStatement("DELETE from product where id in "
	 		+ "(SELECT OI.productId FROM orders O left join orderitem OI "
	 		+ "ON O.ID = OI.OrderID WHERE O.ORDERDATE > date_sub(curdate(),INTERVAL 1 YEAR));");
	 
	 int cntDelete = ps.executeUpdate(); 
	 
	 return cntDelete; 
	
		
	}
	
	/**
	 * used to display the category title of all top parent categories sorted alphabetically
	 *  and the count of their child categories
	 */
    public List<Category> displayCategory(Connection con)throws SQLException {
    	
    	List<Category> categoryList = new ArrayList<Category>();
    	PreparedStatement ps = con.prepareStatement("select parentcategory, count(title) AS count from category group "
    			+ "by parentcategory order by parentcategory;");
    	
    	ResultSet result = ps.executeQuery();
    	
    	while(result.next()) {
    		
    		Category category =new Category();
    		
    		
    		category.setParentCategory(result.getString("parentCategory"));
    		category.setCountTitle(result.getInt("count"));
    		
    		categoryList.add(category);
    		
    		
    	}
    return categoryList; 
    }
}
