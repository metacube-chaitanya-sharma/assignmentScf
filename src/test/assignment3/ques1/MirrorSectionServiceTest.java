package test.assignment3.ques1;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import assignment3.ques1.MirrorSectionService;

public class MirrorSectionServiceTest {
	
	
	@Test
	public void maxMirror() {
		
		
		MirrorSectionService service = new MirrorSectionService();
		
		
		ArrayList<Integer> maxMirrorArray1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 8, 9, 3, 2, 1));
		ArrayList<Integer> maxMirrorArray2 = new ArrayList<Integer>(Arrays.asList(7, 1, 4, 9, 7, 4, 1));
		ArrayList<Integer> maxMirrorArray3 = new ArrayList<Integer>(Arrays.asList(1, 2, 1, 4));
		ArrayList<Integer> maxMirrorArray4 = new ArrayList<Integer>(Arrays.asList(1, 4, 5, 3, 5, 4, 1));
		ArrayList<Integer> maxMirrorArray5 = new ArrayList<Integer>();
		
		
		int actualResult1 = service.maxMirror(maxMirrorArray1 , maxMirrorArray1.size());
		int actualResult2 = service.maxMirror(maxMirrorArray2, maxMirrorArray2.size());
		int actualResult3 = service.maxMirror(maxMirrorArray3, maxMirrorArray3.size());
		int actualResult4 = service.maxMirror(maxMirrorArray4, maxMirrorArray4.size());
		
		int exceptedResult1 = 3; 
		int exceptedResult2 = 2; 
		int exceptedResult3 = 3; 
		int exceptedResult4 = 7; 
		
		
		Assertions.assertEquals(exceptedResult1, actualResult1);
		Assertions.assertEquals(exceptedResult2, actualResult2);
		Assertions.assertEquals(exceptedResult3, actualResult3);
		Assertions.assertEquals(exceptedResult4, actualResult4);
		

//		Assertions.assertFalse(maxMirrorArray5.isEmpty(), "array is empty");
	
		
		
	}

}
