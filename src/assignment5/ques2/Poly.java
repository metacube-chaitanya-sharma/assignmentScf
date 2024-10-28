package assignment5.ques2;

import java.util.ArrayList;

final public class Poly {
	
	final private ArrayList<Integer> arr; 
	
	Poly(ArrayList<Integer> arr){
		
		this.arr = arr; 
	}
	
	public void printArray(ArrayList<Integer> arr) {
		
		for(int i=0; i<arr.size()-1; i += 2) {
			
			if(i == arr.size()-2) {
				System.out.print(" "+arr.get(i)+ " x^" + arr.get(i+1));
			}
			else {
				System.out.print(" "+arr.get(i)+ " x^" + arr.get(i+1)+"+");
			}
		}
		System.out.println("");
	}
	
	/**
	 * Method return the value of the polynomial for given variable
	 * @param a is variable
	 */
	public int  evaluate(float a) {
		
		
		int num = (int) a; 
		
		for(int index=0; index<arr.size(); index += 2) {
			
			if(num == arr.get(index)) {
				return arr.get(index +1); 
			}
		}
		
		return -1; 
	}
	
	/**
	 * it will return the value of the maximum degree of the  polynomial 
	 */
	public int  degree() {
		
		int maxi = -1; 
		
		for(int index = 1; index < arr.size(); index += 2 ) {
			
			if(arr.get(index) > maxi) {
				maxi = arr.get(index);
			}
		}
		return maxi; 
	}
	
	/**
	 * Method to add the two  polynomial
	 * @param p1
	 * @param p2
	 * @return the sum of the Poly1 and Poly2
	 */
	public ArrayList<Integer> addPoly(Poly p1, Poly p2) {
		
		
		int len1 = p1.arr.size();
		int len2 = p2.arr.size(); 
		
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		int sum =0; 
		
		for(int index = 1; index<len1 ; index += 2) {
			
			 sum =0; 
			for(int j = 1; j<len2; j += 2) {
				
				if(p1.arr.get(index) == p2.arr.get(j)) {
					sum += p1.arr.get(index-1) + p2.arr.get(j-1);
					res.add(sum);
					res.add(p1.arr.get(index));
				}
			}
		}

		return res;
		
	}
	
	/**
	 * Method to multiply the two  polynomial
	 * @param p1
	 * @param p2
	 * @return
	 */
	public ArrayList<Integer>  multiplyPoly(Poly p1, Poly p2) {
		
		int len1 = p1.arr.size();
		int len2 = p2.arr.size(); 
		
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		int mul = 1; 
		
		for(int index = 1; index<len1 ; index += 2) {
			
			for(int j = 1; j<len2; j += 2) {
				
				
				 mul =	p1.arr.get(index-1) * p2.arr.get(j-1);
				 res.add(mul);
				 res.add(p1.arr.get(index)*p2.arr.get(j));
				}
			
		}
		return res;
		
	}

}
