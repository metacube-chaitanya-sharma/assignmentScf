package test.assignment3.ques3;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import assignment3.ques3.RearrangedArrayService;

public class RearrangedArrayServiceTest {
	
	@Test
	public void rearrangeTheArrayTest(){
		
		RearrangedArrayService service = new RearrangedArrayService();
		
		ArrayList<Integer> fixXY1 = new ArrayList<Integer>(Arrays.asList(5, 4, 9, 4, 9, 5));
		ArrayList<Integer> fixXY2 = new ArrayList<Integer>(Arrays.asList(1, 4, 1, 5));
		ArrayList<Integer> fixXY3 = new ArrayList<Integer>(Arrays.asList(1, 4, 1, 5, 5, 4, 1));
		ArrayList<Integer> fixXY4 = new ArrayList<Integer>();
		
		
		ArrayList<Integer> actualResult1 = service.rearrangeTheArray(fixXY1, 4, 5);
		ArrayList<Integer> actualResult2 = service.rearrangeTheArray(fixXY2, 4, 5);
		ArrayList<Integer> actualResult3 = service.rearrangeTheArray(fixXY3, 4, 5);
		
		ArrayList<Integer> expectedResult1 = new ArrayList<Integer>(Arrays.asList(9, 4, 5, 4, 5, 9));
		ArrayList<Integer> expectedResult2 = new ArrayList<Integer>(Arrays.asList(1, 4, 5, 1));
		ArrayList<Integer> expectedResult3 = new ArrayList<Integer>(Arrays.asList(1, 4, 5, 1, 1, 4, 5));
		
		
		Assertions.assertIterableEquals(expectedResult1, actualResult1);
		Assertions.assertIterableEquals(expectedResult2, actualResult2);
		Assertions.assertIterableEquals(expectedResult3, actualResult3);
		
		Assertions.assertFalse(fixXY4.isEmpty(), "array is empty"); 
        
        
	}

}
