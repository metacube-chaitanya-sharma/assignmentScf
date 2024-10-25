package test.assignment4.ques1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import assignment4.ques1.FactorUsingRecursionService;

public class FactorUsingRecursionServiceTest {

	
	@Test
	public void factorNumber() {
		
		
		FactorUsingRecursionService service = new FactorUsingRecursionService();
		
		
		int inputNumber1 = 20 ,
			inputNumber2 = 80 ; 
		
		int inputNumber3 = 16 ,
				inputNumber4 = 5 ; 
			
		
		
		int actualResult1 = service.lcmNumber(inputNumber1 , inputNumber2);
		int actualResult2 = service.lcmNumber(inputNumber3 , inputNumber4);
		
		
		int exceptedResult1 = 80;
		int exceptedResult2 = 30;
		
		 
		
		
		Assertions.assertEquals(exceptedResult1, actualResult1);
		Assertions.assertEquals(exceptedResult2, actualResult2);
	
		
		
	}
}
