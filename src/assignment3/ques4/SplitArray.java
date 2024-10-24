package assignment3.ques4;

import java.util.Scanner;

public class SplitArray {

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
		
		
		SplitArrayService service = new SplitArrayService();
		System.out.println("index " + service.splitIndex(inputArray));
		
		}
		catch(AssertionError e) {
			System.out.println("Not a Valid number"); 
		}

	}

}
