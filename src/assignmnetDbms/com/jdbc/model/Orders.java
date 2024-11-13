package assignmnetDbms.com.jdbc.model;

import java.sql.Date;

public class Orders {
	
	private int id; 
	private int shopperId;
	private Date orderDate;
	private int orderTotal; 
	private String status;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getShopperId() {
		return shopperId;
	}
	public void setShopperId(int shopperId) {
		this.shopperId = shopperId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public int getOrderTotal() {
		return orderTotal;
	}
	public void setOrderTotal(int orderTotal) {
		this.orderTotal = orderTotal;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Orders [id=" + id + ", shopperId=" + shopperId + ", orderDate=" + orderDate + ", orderTotal="
				+ orderTotal + ", status=" + status + "]";
	} 
	
	
	
	
	

}
