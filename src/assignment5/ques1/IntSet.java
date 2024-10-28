package assignment5.ques1;

import java.util.ArrayList;

final public class IntSet {
	
	final private int [] arr; 
	
	
	 IntSet(int [] arr) {
	
		this.arr = arr;
	 }


    /**
     * Method is used to find that a number is a member or not
     * @param x
     * @return
     */
	public boolean isMember(int x) {
		
        for(int index =0; index<arr.length; index++) {
			
			if(this.arr[index] == x) {
				return true; 
			}
		}
        return false; 
		
	}
	
	/**
	 * Method is used to find the size of the set
	 * @return
	 */
	public int  size() {
		
		return arr.length;
		
	}
	
	/**
	 * Method is used to find the Subset 
	 * @param s
	 * @return
	 */
	public boolean isSubSet(IntSet s) {
		
		boolean found = false;
		
		for(int ele1: this.arr) {
	
			for(int ele2 : s.arr) {
				
				if(ele1 == ele2) {
					found = true; 
					break ; 
				}
		
			}
			
			if(!found) return false; 
		}
		return true; 
	}
	
	/**
	 * Method is used to take the complement of the set
	 * @return
	 */
	public ArrayList<Integer> getComplement() {
		
		
		ArrayList<Integer>  res = new ArrayList<Integer>();
		
		for(int index =1; index <= 1000; index++) {
			
			if(!isMember(index)) {
				res.add(index);
			}
		
		}
		
		return res; 
		
		
	}
	
	/**
	 * Method is used to calculate the union of the two set
	 * @param s
	 * @return
	 */
	public ArrayList<Integer> union(IntSet s) {
	
		
		ArrayList<Integer> res = new ArrayList<Integer>();
		
       for(int it : this.arr) {
    	   res.add(it);
       }
       
	   for(int index =0; index<s.size(); index++) {
			
			if(!res.contains(s.arr[index]))
			res.add(s.arr[index]); 
		}
		
		return res; 
		
	}
}
