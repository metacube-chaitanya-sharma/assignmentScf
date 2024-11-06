package main.java;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.HashMap;
import java.util.List;

class HelloWorld {
    

    public static void main(String[] args) {
       
    
       HashMap<String , Timestamp> mp = new HashMap<String ,Timestamp>();
       
       mp.put("Square",  Timestamp.from(Instant.now()));
       mp.put("circle" , Timestamp.from(Instant.now()));
       mp.put("triangle" , Timestamp.from(Instant.now()));
       mp.put("rectangle" , Timestamp.from(Instant.now()));
     
       
       App o = new App();
       List<String> ans = o.sortByValue(mp);
       
       for(String it : ans){
           System.out.println(it);
       }
        
        
        
        
    }
}
