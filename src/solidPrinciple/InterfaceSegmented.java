package solidPrinciple;

public class InterfaceSegmented {
	
	// Interfaces should be such , that client should not implement
	// unnecessary functions they do not need
	
	
	
	 interface RestaurantEmployee{
		 
		 void washDishes();
		 void serveCustomers();
		 void cookFood();
	 }
	 
	 class waiter implements RestaurantEmployee{
		 
		 public void washDishes() {
			 // not my job
		 }
		 
		 public void serveCustomers() {
			 // my job 
		 }
		 
		 public void cookFood() {
			 // not my job
		 }
		 
		 
	 }
	 // waiter has no job to related like washDishes and cookFood
	 
	 // so to solve this problem we have to break the interface such that 
	 // we should not implement the unnecessary functions
	 
//	 Solution :
	 
	 interface WaiterInterface{
		 
		 void serveCustomers();
		 void takeOrder();
	 }
	 
	 
	 interface chefInterface{
		 void cookFood();
		 void decideMenu();
	 }
	 
	 class waiter1 implements WaiterInterface{
		 
		 public void serveCustomers() {
			 
		 }
		 
		 public void takeOrder() {
			 
		 }
	 }
	 
	 
	 
	 
		 
		 
	 

}
