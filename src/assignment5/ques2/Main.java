package assignment5.ques2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 2*x^4 + 5* x^3 + 3* x^2
		// how we store the this into the array is that 
		// {2 , 4 , 5, 3, 3, 2} like this 
		// index0 = Coefficient part
		// index1 = Exponent part
		
		// in even places -> coefficient values
		// in odd places -> exponent part
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size"); 
		int size = sc.nextInt(); 
		
		if(size%2 != 0) {
			throw new AssertionError(" size must be even number");
		}
		
		int [] arr = new int[size];
		
		System.out.println("enter the element in such order that first is coefficient value"
				+ " then exponent part");
		
		for(int i=0; i<size; i++) {
			
			arr[i] = sc.nextInt();		
		}
		
		ArrayList<Integer>  inputArr = new ArrayList<Integer>();
		
		
		for(int i =1; i<size; i += 2) {
			
			if(arr[i-1] != 0) {
				inputArr.add(arr[i-1]);
				inputArr.add(arr[i]); 
			}
		}
		
		
		Poly p1 = new Poly(inputArr);
		Poly p2 = new Poly(new ArrayList<Integer>(Arrays.asList(1,2,3,5)));
		
		
		
			
			System.out.println(inputArr);
	
		System.out.println("degree ->" +p1.degree());
		System.out.println("the value of the polynomial for given variable ->" +p1.evaluate(5));
		System.out.println("sum -> " +p1.addPoly(p1, p2)); 
		System.out.println("multiply -> " +p1.multiplyPoly(p1, p2));
		
		
		
		
		

	}

}
