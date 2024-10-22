package assignment2.ques1;

import java.util.Scanner;

public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the String1");
		String str1 = sc.nextLine();
		
		System.out.println("enter the String2");
		String str2 = sc.nextLine();
		
		CompareStringService service = new CompareStringService();
		
		System.out.println("equalsOrNot-> "+service.equalsOrNot(str1, str2));
		System.out.println("reverseString-> "+service.reverseString(str1));
		System.out.println("lowerCase to UpperCase-> " + service.lowerCaseToUpperCase(str2));
		System.out.println("largestWord in String-> " +service.largestWordInString(str2));
		
		

	}

}
