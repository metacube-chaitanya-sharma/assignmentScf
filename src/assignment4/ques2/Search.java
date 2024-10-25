package assignment4.ques2;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		
		int[] arr  = new int[size] ; 
		 
		for(int i=0; i<size; i++) {
			
			System.out.print("enter the element "+i);
			arr[i] = sc.nextInt(); 
		}
		
		System.out.println("enter the element to find");
		int numberToFind = sc.nextInt(); 		
		
		
		SearchService service = new SearchService();
	    System.out.println("Linear Search -> index " + service.linearSearch(arr,  numberToFind, size)); 
	
		int [] binary = {2,3,5,6,7,8,9};
	    System.out.println("Binary Search -> index " + service.binarySearch(binary,  3, binary.length)); 
		
		}
		
		
	

}
