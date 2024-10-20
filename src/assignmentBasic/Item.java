package assignmentBasic;

public class Item{
  
  private Integer itemId = 0 ; 
  private String name; 
  private String description; 
  private Integer price; 
  
  
  Item(){
    this.itemId = itemId + 1; 
  }
  
  // Getter
  public Integer getId(){
    return itemId; 
  }
  
 
  // Getter
  public String getName(){
    return name; 
  }
  
  // Setter
  public void setName(String name){
    this.name = name; 
  }
  
  // Getter
  public String getDescription(){
    return description; 
  }
  
  // Setter
  public void setDescription(String description){
    this.description = description; 
  }
  
  
  // Getter
  public Integer getPrice(){
    return price; 
  }
  
  // Setter
  public void setPrice(Integer price){
    this.price = price; 
  }
  
  
 
  
}