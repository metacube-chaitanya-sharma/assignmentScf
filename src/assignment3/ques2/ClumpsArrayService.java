package assignment3.ques2;

public class ClumpsArrayService {
	
	/**
	 * calculate the number of count clumps in array
	 * @param countClumps
	 * @return the count of 2 or more adjacent elements of the same value
	 */
	public int numberOfClumps(int [] countClumps) {
		
	
		
		int firstIndex = 0,
		    secondIndex = 1,
		    ans =0,
		    currCnt =0,
		    len = countClumps.length; 
		
		while(secondIndex<len) {
			
			if(countClumps[firstIndex] != countClumps[secondIndex]) {
				
				if(currCnt > 0) {
					ans++; 
					currCnt = 0; 
				}
				firstIndex = secondIndex;  
				secondIndex++; 
			}
			else {
				currCnt++;  
				secondIndex++; 
			}
		}
		// for the last index
		if(currCnt > 0) {
			ans++; 
		}
	
		
		
		return ans; 

}
}
