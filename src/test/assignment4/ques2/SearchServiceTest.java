package test.assignment4.ques2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import assignment4.ques2.SearchService;

public class SearchServiceTest {
	

	@Test
	public void search() {
		
		
		SearchService service = new SearchService();
		
		
		int[] linearInput1 = {2,3,53,4,32,21}; 
		
		int numberToFind1 = 3; 
		
		
		int [] binaryInput1 = {2,3,4,5,6,7,8};
		int numberToFind2 = 5; 
			
		
		
		int actualResult1 = service.linearSearch(linearInput1, numberToFind1, linearInput1.length);
		int actualResult2 = service.linearSearch(binaryInput1, numberToFind2, binaryInput1.length);
		
		
		
		int exceptedResult1 = 1;
		int exceptedResult2 = 3;
		
		 
		
		
		Assertions.assertEquals(exceptedResult1, actualResult1);
		Assertions.assertEquals(exceptedResult2, actualResult2);
	
		
		
	}

}
