package assignmnetDbms.com.jdbc.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import assignmnetDbms.com.jdbc.dao.HelperDao;
import assignmnetDbms.com.jdbc.model.Orders;
import assignmnetDbms.com.jdbc.util.DatabaseConnection;

public class Application {

	public static void main(String[] args)
	throws SQLException{
		// TODO Auto-generated method stub
	    Connection con = DatabaseConnection.getConnection();
		
		HelperDao helperDao = new HelperDao();
	    
		List<Orders>  orders = helperDao.getAllOrders(con , 5);
		
		for(Orders index : orders) {
			System.out.println("orderId: " + index.getId() + " " + "orderDate: " + index.getOrderDate() + " " +"orderTotal: "+ index.getOrderTotal());
		}
		
		
		System.out.println(" "); 
		helperDao.addImages(con);
		
		

		

	}

}
