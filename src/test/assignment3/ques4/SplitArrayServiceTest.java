package test.assignment3.ques4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import assignment3.ques4.SplitArrayService;

public class SplitArrayServiceTest {
	
	@Test
	public void splitIndexTest() {
		
		SplitArrayService service = new SplitArrayService();
		
		int[] splitArray1 = {1, 1, 1, 2, 1};
		int[] splitArray2 = {2, 1, 1, 2, 1};
		int[] splitArray3 = {10, 10};
		int[] splitArray4 = {};
		
		int actualResult1 = service.splitIndex(splitArray1); 
		int actualResult2 = service.splitIndex(splitArray2); 
		int actualResult3 = service.splitIndex(splitArray3); 
		
		int expectedResult1 = 3;
		int expectedResult2 = -1;
		int expectedResult3 = 1;
		
		Assertions.assertEquals(expectedResult1, actualResult1);
		Assertions.assertEquals(expectedResult2, actualResult2);
		Assertions.assertEquals(expectedResult3, actualResult3);
		
		Assertions.assertNotEquals(0 , splitArray4.length);
		
	}

}
