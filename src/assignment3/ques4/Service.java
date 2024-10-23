package assignment3.ques4;

public class Service {
	
	/**
	 * Return the index if there is a place to split the input array so that
	 * the sum of the numbers on one side is equal to the sum of the numbers
	 * on the other side
	 * @param inputArray
	 * @return split index
	 */
	public int splitIndex(int splitArray[]) {
		int sum =0; 
		for(int index=0; index<splitArray.length; index++) {
			
			sum += splitArray[index];
		}
		
		if(sum < 0) {
			return -1; 
			
		}else {
			int currSum =0; 
			
			for(int index=0; index<splitArray.length; index++) {
				
				currSum += splitArray[index];
				
				if(currSum == sum/2) {
					return index+1; 
				}
			
		    }
		}
		return -1; 
		
	}

}
