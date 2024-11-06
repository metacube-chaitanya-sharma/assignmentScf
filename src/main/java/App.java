package main.java;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class App {

	public   List<String> sortByValue(HashMap<String, Timestamp> hm)
    {

        
        List<String> ans = new ArrayList<String>();
        List<Timestamp> sortedValue = new ArrayList<Timestamp>();
        
        
       
        
       
        for(HashMap.Entry<String, Timestamp> entry1 : hm.entrySet()) {
        	sortedValue.add(entry1.getValue());
        	System.out.println(entry1.getValue());
        	System.out.println(entry1.getKey());
        }
        
        Collections.sort(sortedValue); 
        
        
        
        for(Timestamp it : sortedValue) {
        	
        	 for(HashMap.Entry<String, Timestamp> entry1 : hm.entrySet()) {
             	
             	
             	
             	if(entry1.getValue() == it) {
             		ans.add(entry1.getKey()); 
             	}
             }
        }
        
//     for(HashMap.Entry<String, Integer> entry1 : hm1.entrySet()) {
//        	
//        	System.out.println(entry1.getKey()+"  "+entry1.getValue());
//        }
//        String shape = " "; 
//        for(HashMap.Entry<String, Integer> entry1 : hm.entrySet()) {
//        	mini = entry1.getValue();
//        	System.out.println("heloo  " + entry1.getKey());
//        	
//        	for(HashMap.Entry<String, Integer> entry2 : hm1.entrySet()) {
////        		shape = entry1.getKey(); 
//        		if(entry1.getValue() >= entry2.getValue() && mini > entry2.getValue()) {
//        			
//        			 shape = entry2.getKey();
//        			 mini = entry2.getValue();
//        			 System.out.println("hey" + shape);
//        			
//        		}
//        		
//        		
//        	
//        	}
//        	
//        	ans.add(shape);
//        	hm1.remove(shape);
//        	// s . c  . t . r
//        	
//        }
        return ans; 
    }

}
