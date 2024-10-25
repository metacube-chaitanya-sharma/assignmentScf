package assignment5.ques1;

import java.util.ArrayList;

final public class IntSet {
	
	final private int [] arr; 
	
	
	 IntSet(int [] arr) {
	
		this.arr = arr;
	 }


    /**
     * 
     * @param x
     * @return
     */
	public boolean isMember(int x) {
		
        for(int index=0; index<1000; index++) {
			
			if(this.arr[index] == x) {
				return true; 
			}
		}
        return false; 
		
	}
	
	/**
	 * 
	 * @return
	 */
	public int  size() {
		
		return arr.length;
		
	}
	
	/**
	 * 
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
	 * 
	 * @return
	 */
	public int[] getComplement() {
		
		
		int [] res = new int[100];
		
		for(int index =0; index < 100; index++) {
			
			for(int ele : this.arr) {
				
				if(ele != index) {
					res[index] = index; 
				}
			}
		}
		
		return res; 
		
		
	}
	
	/**
	 * 
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
