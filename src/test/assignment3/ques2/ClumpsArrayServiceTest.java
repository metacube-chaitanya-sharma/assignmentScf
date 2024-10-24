package test.assignment3.ques2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import assignment3.ques2.ClumpsArrayService;


public class ClumpsArrayServiceTest {
	
	@Test
	@DisplayName("this is Clumps test cases")
	public void numberOfClumps() {
		
		ClumpsArrayService service = new ClumpsArrayService();
		int[] countClumps1 = {1, 2, 2, 3, 4, 4};
		int[] countClumps2 = {1, 1, 2, 1, 1};
		int[] countClumps3 = {1, 1, 1, 1, 1};
		
		int[] countClumps4 = {};		
		
		int actualResult1 = service.numberOfClumps(countClumps1);
		int actualResult2 = service.numberOfClumps(countClumps2);
		int actualResult3 = service.numberOfClumps(countClumps3);
		
		int expectedResult1 = 2; 
		int expectedResult2 = 2; 
		int expectedResult3 = 1; 
		
		Assertions.assertEquals(expectedResult1, actualResult1);
		Assertions.assertEquals(expectedResult2, actualResult2);
		Assertions.assertEquals(expectedResult3, actualResult3);
		
//		Assertions.assertNotEquals(0 , countClumps4.length);
 
		
	
	}

}
