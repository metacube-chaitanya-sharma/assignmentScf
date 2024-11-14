package assignmnetDbms.com.jdbc.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import assignmnetDbms.com.jdbc.model.Category;
import assignmnetDbms.com.jdbc.model.Orders;

public interface StoreFrontDao {
	
	public void addImages(Connection con) throws SQLException; 
	public List<Orders> getAllOrders(Connection con , int shopperId) throws SQLException; 
	public int deleteAllProduct(Connection con) throws SQLException;
	public List<Category> displayCategory(Connection con)throws SQLException; 

}
