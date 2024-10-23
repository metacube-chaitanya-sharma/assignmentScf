package assignment3.ques3;

import java.util.ArrayList;
import java.util.Scanner;

public class RearrangedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of array");
		int len = sc.nextInt();
		
       try {
			
			if(len <= 0) {
				throw new AssertionError(); 
			}
		}
		catch(AssertionError e) {
			System.out.println("Size must be greater than 0"); 
		}
		
		ArrayList<Integer> fixXY = new ArrayList<Integer>();
		
		for(int index=0; index<len; index++) {
			System.out.println("enter the element "+index);
		
			fixXY.add(sc.nextInt());
			
			
		}
		
		System.out.println("enter the value of X");
		int X = sc.nextInt();
		
		System.out.println("enter the value of Y");
		int Y = sc.nextInt();
		
		
		
		Service service = new Service();
		System.out.println( service.rearrangeTheArray(fixXY , X , Y));
		
		

	}
}
