package assignment3.ques3;

import java.util.ArrayList;

public class Service {
	
	/**
	 * rearranges the array in such a way that the X is not moved 
	 * and every X is immediately followed by a Y
	 * @param fixXY 
	 * @param X fixed number which is not swapped
	 * @param Y number which is swapped
	 * @return
	 */
	public ArrayList<Integer> rearrangeTheArray(ArrayList<Integer> fixXY , int X , int Y) {
		
		
		try {
			
			int cntX =0 , cntY=0; 
			for(int index = 0; index<fixXY.size(); index++) {
				
				if(cntX == X) {
					cntX++;
				}
				if(cntY == Y) {
					cntY++; 
				}
			}
			if(cntX != cntY) {
				throw new AssertionError();
			}
		}catch(AssertionError e) {
			System.out.println("enter the number of X and number of Y equal"); 
		}
		
		
		try {
			if(X == fixXY.get(fixXY.size()-1)) {
				throw new AssertionError();
			}
		}catch(AssertionError e) {
			System.out.println("Not enter the last value as the X"); 
		}
		
		
		
		int ans=0;
		
		  for(int i=0; i< fixXY.size() ; i++) {
		     for(int j=0;j<fixXY.size() ; j++) {

		     if(fixXY.get(i)== Y && fixXY.get(j)== X)
		     {
		      ans = fixXY.get(j+1);
		      fixXY.set(j+1, fixXY.get(i));	
		      fixXY.set(i , ans);
		     }
		     
		     }
		  }
		  
		  return fixXY; 
		
	}

}
