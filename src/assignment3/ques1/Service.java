package assignment3.ques1;

import java.util.ArrayList;

public class Service {
	
	/**
	 * 
	 * @param nums
	 * @return
	 */
	public ArrayList<Integer> reverseArray(ArrayList<Integer> nums) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>(nums.size());
		
		   for (int pos = nums.size()-1; pos >0; pos--) {
		      arr.add(pos , nums.get(pos));
		   }
		   return arr;
	
}
	/**
	 * 
	 * @param reverseArray
	 * @param newArray
	 * @return
	 */
	public boolean check(ArrayList<Integer>  reverseArray , ArrayList<Integer>  newArray) {
		
		for(int index=0; index<reverseArray.size(); index++) {
			
			if(reverseArray.get(index) != newArray.get(index)) {
				return false; 
			}
		}
		return true; 
	}
	
	
	
	
	/**
	 * 
	 * @param arr
	 * @param size
	 * @return
	 */
	public int maxMirror(ArrayList<Integer> arr, int size) {
		
		 for(int window = size; window >= 1; window--){
			 
			 
	            for(int i=0; i<size-window+1; i++){
	            	
	            	
	                ArrayList<Integer> toBeChecked = new ArrayList<Integer>();
	                
	                for(int j=0; j<window; j++){
	                    toBeChecked.add(arr.get(i+j));
	                }
	                
	                toBeChecked = reverseArray(toBeChecked);
	                for(int k=0; k<size-window+1; k++){  
	                	
	                    ArrayList<Integer> toBeCompared = new ArrayList<Integer>();             
	                    for(int j=0; j<window; j++){
	                        toBeCompared.add(arr.get(k+j));
	                    }
	                    if(check(toBeChecked,toBeCompared))
	                    {
	                        return window;
	                    }
	                    
	                }
	           }  
	       }
	     return 0;

		}

}
