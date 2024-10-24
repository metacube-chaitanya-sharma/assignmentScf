package assignment4.ques1;

public class FactorUsingRecursionService {
	
	/**
	 * 
	 * @param n
	 * @return
	 */
	 public static boolean isPrime(int n) {  
	       if (n <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i < Math.sqrt(n); i++) {  
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	   }  
	
	 /**
	  * 
	  * @param num1
	  * @param num2
	  * @param index
	  * @param ans
	  */
	public int lcm(int num1 , int num2 , int index , int ans) {
		
		if(index > num2) {
			return ans; 
		}
	
		if(isPrime(index)) {
			
			
			if(num1%index == 0 && num2%index ==0) {
				ans = ans* index; 
				num1 = num1/index; 
				num2= num2/index; 
			}
			else if(num1%index ==0 ) {
				
				ans = ans*index; 
				num1 = num1/index; 
			}
			else if(num2%index ==0) {
				ans = ans*index; 
				num2 = num2/index; 
			}
		}
	
		return lcm(num1 , num2 , index+1 , ans);
		
	}
	
	/**
	 * 
	 * @param number1
	 * @param number2
	 * @return
	 */
	public int lcmNumber(int number1 , int number2) {
		
		int index = 2;
		int ans = 1; 
		
		if(number1 == 0)
			return number2; 
		
		if(number2 == 0)
			return number1; 
		
		if(number1 == number2)
			return number1; 
		
		if(number1 > number2) {
			
			if(number1 %number2 == 0) {
				return number1; 
			}else {
				return lcm(number2, number1 , index , ans);
			}
		}else {
			if(number2 % number1 == 0) {
				return number2; 
			}
			else {
				return lcm(number1, number2 , index , ans);
			}
		}
		
		
		 
		
	}


	
	
	public int hcfNumber(int number1 , int number2) {
		
		if(number1 == 0)
			return number2; 
		if(number2 == 0)
			return number1; 
		
		if(number1 == number2)
			return number1; 
		
		if(number1 > number2)
			return hcfNumber(number1 - number2 , number2);
		
		return hcfNumber(number1 , number2- number1);
	}
}
