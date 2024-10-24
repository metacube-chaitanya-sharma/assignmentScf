package assignment3.ques2;

import java.util.ArrayList;
import java.util.Scanner;

public class ClumpsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int len = sc.nextInt();
		
		try {
			
			if(len <= 0)
				throw new AssertionError(); 
			
			int [] inputArray = new int[len];
			for(int index=0; index<len; index++) {
				
				System.out.println("enter the element "+index);
				inputArray[index] = sc.nextInt();			
			}
			
			
			ClumpsArrayService service = new ClumpsArrayService();
			System.out.println("count Clumps " + service.numberOfClumps(inputArray));
			
		}
		catch(AssertionError e) {
			System.out.println("Not a valid number"); 
		}
		
		

		

	}

}
