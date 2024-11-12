package assignmnetDbms.com.jdbc.main;

import java.sql.SQLException;

import assignmnetDbms.com.jdbc.dao.OrderDao;

public class Application {

	public static void main(String[] args)
	throws SQLException{
		// TODO Auto-generated method stub
		
		
		OrderDao orderDao = new OrderDao();
		
		orderDao.getAllOrders();
		
		
		
//		Statement stmt = con.createStatement();
//
//		stmt.addBatch("INSERT INTO employees VALUES (1000, 'Joe Jones')");
//		stmt.addBatch("INSERT INTO departments VALUES (260, 'Shoe')");
//		stmt.addBatch("INSERT INTO emp_dept VALUES (1000, 260)");
//
//		// submit a batch of update commands for execution
//		int[] updateCounts = stmt.executeBatch();
		

	}

}
