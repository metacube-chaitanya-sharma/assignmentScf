package assignmnetDbms.com.jdbc.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import assignmnetDbms.com.jdbc.dao.HelperDao;
import assignmnetDbms.com.jdbc.model.Category;
import assignmnetDbms.com.jdbc.model.Orders;
import assignmnetDbms.com.jdbc.util.DatabaseConnection;

public class Application {

	public static void main(String[] args)
	throws SQLException{
		// TODO Auto-generated method stub
	    Connection con = DatabaseConnection.getConnection();
		
		HelperDao helperDao = new HelperDao();
	    
		// used to get all the order of particular shopperid 
		List<Orders>  orders = helperDao.getAllOrders(con , 5);
		
		for(Orders index : orders) {
			System.out.println("orderId: " + index.getId() + " " + "orderDate: " + index.getOrderDate() + " " +"orderTotal: "+ index.getOrderTotal());
		}
		
		// used to add the image url by using batch 
		System.out.println(" "); 
		helperDao.addImages(con);
		
		// used to delete the product which is not order since last year
		System.out.println("Number of product deleted :" + helperDao.deleteAllProduct(con)); 
		
		
		System.out.println("");
		// used to find out the display category title of all top parent categories
        List<Category>  categoryList= helperDao.displayCategory(con);
		
		for(Category index : categoryList) {
			System.out.println( "parentCategory: "+ index.getParentCategory() +" "+ " categoryTitle: " + index.getCountTitle());
		}
		
		

		

	}

}
