package assignment1;

public class HexaCalc {

	public static void main(String[] args) {
		
		String number1 = "1A";
		String number2 = "1AB";
		
		ServiceHexaCalc service = new ServiceHexaCalc();
		
		System.out.println(service.add(number1, number2)); 
		System.out.println(service.subtract(number1, number2));
		System.out.println(service.multiply(number1, number2));
		System.out.println(service.divide(number1, number2));
		System.out.println(service.compareTwoNumber(number1, number2, "=="));
		
		
	}
}
