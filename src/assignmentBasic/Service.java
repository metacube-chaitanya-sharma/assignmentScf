package assignmentBasic;
import java.util.HashMap; 
public class Service{
  
  
  HashMap<Item , Integer> itemInCart = new HashMap<Item , Integer>();
  

  // To Add the item into the Cart
  public void addToCart(Item item , Integer quantity){
    
	  if(quantity == null || quantity <= 0 ) {
		  System.out.println("You should pass valid quantity");
		  return ;
		  
	  }
	  
    if(!itemInCart.containsKey(item)){
    	itemInCart.put(item , quantity);
    }
    else{
       
    	itemInCart.put(item , itemInCart.getOrDefault(item , 0) + quantity);
    }
   
  }
  
  // To display the quantity of the item
  public Integer displayQty(Item item){
    
    if(itemInCart.containsKey(item)){
    return itemInCart.get(item);
    }
    return 0; 
  }
  
  // To update the quantity of the item 
  public void updateQty(Item item , Integer quantity){
	  
	  if(quantity == null || quantity <= 0 ) {
		  System.out.println("You should pass valid quantity");
		  return ;
		  
	  }
    
    if(itemInCart.containsKey(item)){
    itemInCart.put(item, quantity);
    }
    else {
    System.out.println("This item is not available");
    }
  }
  
  // delete the item from the cart
  public void deleteItem(Item item){
    
    if(itemInCart.containsKey(item)){
       itemInCart.remove(item); 
    }
    else {
    	System.out.println("This item is not available");
    }
    
   
  }
  
  // Return the total amount 
  public Double displayBill(){
    
    Double totalBill =0.0; 
    

for (HashMap.Entry<Item, Integer> it : itemInCart.entrySet()) {
  
  
    Integer value = it.getValue();
   Item myItem = it.getKey();
  
  totalBill +=  myItem.getPrice() * value;
     
}

return totalBill; 
  }
  
 

}
