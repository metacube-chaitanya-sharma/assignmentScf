package assignment4.ques1;

import java.util.Scanner;

public class FactorUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//for Lcm Number
		System.out.println("LCM Number");
		System.out.println("enter the number1 ");
		int number1 = sc.nextInt();	
		System.out.println("enter the number2 ");
		int number2 = sc.nextInt();
		
		// Service to call the method 
		FactorUsingRecursionService service = new FactorUsingRecursionService();
		System.out.println(service.lcmNumber(number1 , number2)); 
	
	
		// for hcf Number
		System.out.println("hcfNumber"); 
		System.out.println("enter the number1 ");
		int numberhcf1 = sc.nextInt();	
		System.out.println("enter the number2 ");
		int numberhcf2 = sc.nextInt();
		
		
		System.out.println(service.hcfNumber(numberhcf1 ,numberhcf2));
		

	}

}
