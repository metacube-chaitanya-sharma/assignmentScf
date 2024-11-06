package main.java;

import java.util.HashMap;
import java.util.List;

class HelloWorld {
    

    public static void main(String[] args) {
       
    
       HashMap<String , Integer> mp = new HashMap<String ,Integer>();
       
       mp.put("Square", 2);
       mp.put("circle" , 3);
       mp.put("triangle" , 4);
       mp.put("rectangle" , 5);
       
       App o = new App();
       List<String> ans = o.sortByValue(mp);
       
       for(String it : ans){
           System.out.println(it);
       }
        
        
        
        
    }
}
