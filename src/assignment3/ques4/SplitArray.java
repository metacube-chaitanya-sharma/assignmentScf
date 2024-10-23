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
		}
		catch(AssertionError e) {
			System.out.println("Size must be greater than 0"); 
		}
		
		int [] inputArray = new int[len];
		
		for(int index=0; index<len; index++) {
			
			System.out.println("enter the element "+index);
			inputArray[index] = sc.nextInt();			
		}
		
		
		Service service = new Service();
		System.out.println("index " + service.splitIndex(inputArray));

	}

}
