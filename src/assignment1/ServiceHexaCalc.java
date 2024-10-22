package assignment1;

public class ServiceHexaCalc {
	
	// Convert HexaDecimal into Decimal
	public int hexaToDecimal(String value) {
		
		int len = value.length();
		
		int base = 1; 
		
		int decimalValue = 0; 
		
		for(int i=len-1; i>=0; i--) {
			
			if(value.charAt(i) >= '0' && value.charAt(i) <= '9') {
				
				decimalValue += (value.charAt(i) - 0) * base; 
				
				base = base * 16; 
				
			}
			else if(value.charAt(i) >= 'A' && value.charAt(i) <= 'F'){
				
				decimalValue += (value.charAt(i) - 'A' + 10 ) * base; 
				
				base = base * 16; 
				
				
			}
		}
		return decimalValue; 
	}
	
	// Convert Decimal into HexaDecimal
	public String decimalToHexa(Integer num) {
	
		String ans  ="";
	    
	    while(num != 0){
	      
	     int temp =0; 
	     
	     temp = num % 16 ; 
	     
	     if(temp < 10 ){
	       ans = (char) (temp + '0') + ans; 
	       
	     }
	     else{
	       ans = (char)(temp + 'A' - 10) + ans;
	     }
	     
	     num = num /16; 
	    }
	    
	   
	    
	    return ans;
	}
	
	// Add two number
	public String add(String number1 , String number2) {
		
		if(number1 == null || number2 == null) {
			System.out.println("You should pass valid number"); 
			return " ";
		}
		
		int num1 = hexaToDecimal(number1); 
		int num2 = hexaToDecimal(number2);
		
		int sum = num1 + num2; 
		
		String result = decimalToHexa(sum);
		
		return result; 
		
		
		
	}
	
	// Subtract two number
	public String subtract(String number1 , String number2) {
		
		if(number1 == null || number2 == null) {
			System.out.println("You should pass valid number"); 
			return " ";
		}
		
		int num1 = hexaToDecimal(number1); 
		int num2 = hexaToDecimal(number2);
		
		int sub = num1 - num2;
		if(sub == 0) {
			return "0";
		}
		else if(sub < 0) {
			return "the answer is negative"; 
		}
		return decimalToHexa(sub); 
		
	}
	
	//multiply two number
	public String  multiply(String number1 , String number2) {
		
		if(number1 == null || number2 == null) {
			System.out.println("You should pass valid number"); 
			return " ";
		}
		
		int num1 = hexaToDecimal(number1); 
		int num2 = hexaToDecimal(number2);
		
		int mul = num1 * num2;
		return decimalToHexa(mul);
	}
	
	//divide two number
	public String divide(String number1 , String number2) {
		
		if(number1 == null || number2 == null) {
			System.out.println("You should pass valid number"); 
			return " ";
		}
		
		if(number2 == "0") {
			return "Number2 should be greater than 0"; 
		}
		int num1 = hexaToDecimal(number1); 
		int num2 = hexaToDecimal(number2);
		
		int div = num1 / num2;
		if(div == 0) {
			return "0";
		}
		return  decimalToHexa(div);
		
	}
	
	// check the twoNumber they are equal , greater , lesser
	public boolean compareTwoNumber(String number1 , String number2 , String operator) {
		
		if(number1 == null || number2 == null ) {
			System.out.println("You should pass valid number"); 
			return false;
		}
		if(operator == null) {
			System.out.println("you should pass the valid operator (== , > ,<");
			return false; 
		}
		
		int len1 = number1.length();
		int len2 = number2.length();
		boolean flag = true; 
		
		if((operator == ">") && (len1 > len2)) {
			return true; 
		}
		else if((operator == ">") && ((len1 < len2) || number1.equals(number2))){
			return false; 
		}
		else if((operator == "<" && (len1 < len2))) {
			return true; 
		}
		else if((operator == "<") && ((len1 > len2) || number1.equals(number2))) {
			return false;
		}
		else if(operator == "==" && number1.equals(number2)) {
			return true; 
		}
		else if(operator == "==" && ((len1 > len2) || (len1 < len2))) {
			return false;
			
		}
		else {
			for(int i=0; i<len1; i++) {
				
				if((operator == ">" ) && (number1.charAt(i) > number2.charAt(i))) {
					flag = true; 
				}
				else if((operator == ">" ) && (number1.charAt(i)< number2.charAt(i))) {
					flag = false; 
					break; 
				}
				else if((operator == "<" ) && (number1.charAt(i) < number2.charAt(i))) {
					flag = true; 
				}
				else if((operator == "<" ) && (number1.charAt(i) > number2.charAt(i))) {
					flag = false; 
					break; 
				}
				else if((operator == "==" ) 
						&& ((number1.charAt(i) < number2.charAt(i)) 
								|| number1.charAt(i) > number2.charAt(i) )) {
					
					flag = false; 
					break; 
					
				}
			}
		}
		return flag; 
	}
	
	

}
