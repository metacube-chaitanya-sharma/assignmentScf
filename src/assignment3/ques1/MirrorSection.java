package assignment3.ques1;

import java.util.ArrayList;
import java.util.Scanner;

public class MirrorSection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc  = new Scanner(System.in);
	
		System.out.println("Enter the size of array");
		int len = sc.nextInt();	
		
        try {
			
			if(len <= 0)
				throw new AssertionError(); 
        }catch(AssertionError e) {
			System.out.println("Size must be greater than 0"); 
		}
		
		ArrayList<Integer> inputArray = new ArrayList<Integer>();
		
		for(int index=0; index<len; index++) {
			
			System.out.println("enter the element "+index);
			inputArray.add(sc.nextInt()); 
			
		}
		
		Service service = new Service();
		System.out.println(service.maxMirror(inputArray , len)); 

	}

}
