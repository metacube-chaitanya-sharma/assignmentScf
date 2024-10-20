package assignmentBasic;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Item item1 = new Item();
		 Item item2 = new Item();
		    
		    item1.setName("Shoe");
		    item1.setDescription("Nike shoe"); 
		    item1.setPrice(3000);
		    
		   
		   
		    
		    item2.setName("Cap");
		    item2.setDescription("Red Cap");
		    item2.setPrice(990);
		    
		   
		    
		    


		    Service service = new Service();
		    
		    
		   service.addToCart(item1 , 1);
		   service.addToCart(item2, 3);
		   System.out.println(service.displayQty(item1)); 
		   service.updateQty(item1, 3);
		   service.deleteItem(item1);
		   service.addToCart(item1, 2);
		   System.out.println(service.displayQty(item1)); 
		   service.addToCart(item1, 3);
		   System.out.println(service.displayQty(item2));		   
		   System.out.println(service.displayBill()); 

	}

}
