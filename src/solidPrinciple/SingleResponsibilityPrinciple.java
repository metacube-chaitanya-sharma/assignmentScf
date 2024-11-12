package solidPrinciple;

public class SingleResponsibilityPrinciple {
	
	// A Class should have only 1 reason to change
	
	 private int price; 
	 private int quantity;
	public SingleResponsibilityPrinciple(int price, int quantity) {
	
		this.price = price;
		this.quantity = quantity;
	} 
	 
	
	public int calculateTotal() {
		
		int totalAmount = this.price * this.quantity; 
		return totalAmount; 
	}
	 

}
