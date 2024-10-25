package assignment5.ques2;

final public class Poly {
	
	final private int [] arr; 
	
	Poly(int [] arr){
		
		this.arr = arr; 
	}
	
	public void evaluate(float a) {
		
		
	}
	
	public void degree() {
		
	}
	
	public int addPoly(Poly p1, Poly p2) {
		
		int len1 = p1.arr.length; 
		
		int sum =0; 
		
		for(int index = 1; index<len1 ; index += 2) {
			
			if(p1.arr[index] == p2.arr[index]) {
				sum += p1.arr[index-1] + p2.arr[index-1];
			}
		}
		return sum;
		
	}
	
	public int  multiplyPoly(Poly p1, Poly p2) {
		
		int len1 = p1.arr.length; 
		int mul = 1; 
		
		for(int index = )
		
	}

}
