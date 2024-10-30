package assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of row");
		int rowSize1 = sc.nextInt();
		System.out.print("enter the size of col");
		int colSize1 = sc.nextInt();	
		
		int [][] arr1 = new int[rowSize1][colSize1];
		
		int size1 =0; 
		for(int row =0; row<rowSize1; row++) {
			for(int col =0; col<colSize1; col++) {
				
				System.out.print("enter the elements of " +row +" row :");
				int element = sc.nextInt(); 
				if(element !=0) {
					size1++; 
					arr1[row][col] = element; 
				}
			}
			System.out.println(" ");
		}
		
		System.out.print("enter the size of row");
		int rowSize2 = sc.nextInt();
		System.out.print("enter the size of col");
		int colSize2 = sc.nextInt();	
		
		int [][] arr2 = new int[rowSize2][colSize2];
		
		int size2 =0; 
		for(int row =0; row<rowSize2; row++) {
			for(int col =0; col<colSize2; col++) {
				
				System.out.print("enter the elements of " +row +" row :");
				int element = sc.nextInt(); 
				if(element !=0) {
					size2++; 
					arr2[row][col] = element; 
				}
			}
			System.out.println(" ");
		}
		
		
		
		
        
        
        SparseMatrices sparse1 = new SparseMatrices(arr1 , rowSize1 ,colSize1);
        
        
        int [][] compactMatrix1 = sparse1.compactMatrix(arr1, size1); 
        // to print the compactMatrix 
//        sparse1.printCompactMatrix(compactMatrix1, size1);
        System.out.println("transpose :");
        sparse1.printMatrix(sparse1.transpose(compactMatrix1 , size1));
        
        System.out.println("symmetric :");
        System.out.println( sparse1.symmetricMatrix(compactMatrix1, size1));
         
        
        SparseMatrices sparse2 = new SparseMatrices(arr2 , rowSize2 ,colSize2);
        int [][] compactMatrix2 = sparse2.compactMatrix(arr2, size2); 

        
        
        int [][] add = new int[3][colSize1]; 
        if(rowSize1 == rowSize2 && colSize1 == colSize2) {
        	
        	add = sparse1.additionOfMatrix(compactMatrix1 , compactMatrix2 , size1 , size2);
        	System.out.println("Addition :");
         	sparse1.printMatrix(add);
        	
        }
        
        int [][] mul = sparse1.multiplication(sparse2, compactMatrix1, compactMatrix2);
        System.out.println("multiplication");
        sparse1.printMatrix(mul);
        
        
        
     

	}

}
