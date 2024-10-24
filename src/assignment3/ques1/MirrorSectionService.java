package assignment3.ques1;

import java.util.ArrayList;

public class MirrorSectionService {
	
	/**
	 * Method reverse the array
	 * @param nums
	 * @return it return the reverseArray 
	 */
	public ArrayList<Integer> reverseArray(ArrayList<Integer> nums , int size) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>(size);
		
		   for (int pos = nums.size()-1; pos >=0; pos--) {
		      arr.add(nums.get(pos));
		   }
		   return arr;
	
}
	/**
	 * check that both array are equal or not 
	 * @param newArray
	 * @param reverseArray 
	 * @return check that both array are equal or not 
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
	 * Mirror section in an array is a group of contiguous elements
	 * @param arr
	 * @param size
	 * @return Mirror section in an array is a group of contiguous elements 
	 * such that somewhere in the array, the same group appears in reverse order
	 */
	public int maxMirror(ArrayList<Integer> arr, int size) {
		
		
		 for(int window = size; window >= 1; window--){
			 
			 
	            for(int index=0; index<size-window+1; index++){
	            	
	            	
	                ArrayList<Integer> toBeChecked = new ArrayList<Integer>();
	                
	                for(int j=0; j<window; j++){
	                    toBeChecked.add(arr.get(index+j));
	                }
	                
	                toBeChecked = reverseArray(toBeChecked , size);
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
