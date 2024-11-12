package assignmnetDbms.com.jdbc.model;

import java.sql.Date;

public class Product {
	
	private int id; 
	private String title; 
	private int quantity; 
	private int price; 
	private String description; 
	private Date dataOfAdded;
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDataOfAdded() {
		return dataOfAdded;
	}
	public void setDataOfAdded(Date dataOfAdded) {
		this.dataOfAdded = dataOfAdded;
	}
	
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", title=" + title + ", quantity=" + quantity + ", price=" + price
				+ ", description=" + description + ", dataOfAdded=" + dataOfAdded + "]";
	} 
	
	

}
