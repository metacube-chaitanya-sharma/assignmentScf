package test.assignment6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import assignment6.SparseMatrices;

public class SparseMatriceTest {
	
	
	
	@Test
	public void transposeTest() {
		
		int [][] inputArray1 = { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 4, 4, 4, 4 } };
		
	
		
		
	  SparseMatrices sparse = new SparseMatrices(inputArray1 , inputArray1.length , inputArray1[0].length);
	    
	  int size =0; 
	  for(int row =0; row<inputArray1.length; row++) {
			for(int col =0; col<inputArray1[0].length; col++) {
				
				
				if(inputArray1[row][col] !=0) {
					size++; 
					
				}
			}
			
		}
	  
      
	  int [][] compactMatrix1 = sparse.compactMatrix(inputArray1, size);
	  
		
				
		int [][] expectedResult1 = { { 1, 2, 3, 4 },
                { 1, 2, 3, 4 },
                { 1, 2, 3, 4 },
                { 1, 2, 3, 4 } };
		
		
		int [][] actualResult1 = sparse.transpose(compactMatrix1,size );
		
		
		
	Assertions.assertArrayEquals(expectedResult1, actualResult1);
		
 
		
	
	}
	
	@Test
	public void additionOfMatrix() {
		
		
		int [][] inputArray1 = { { 1,1} , {2,2}};
		int [][] inputArray2 = { { 1,1} , {2,2}};
		
		
		
		SparseMatrices sparse1 = new SparseMatrices(inputArray1 , inputArray1.length , inputArray1[0].length);
		SparseMatrices sparse2 = new SparseMatrices(inputArray2 , inputArray2.length , inputArray2[0].length);
	    
		  int size1 =0; 
		  for(int row =0; row<inputArray1.length; row++) {
				for(int col =0; col<inputArray1[0].length; col++) {
					
					
					if(inputArray1[row][col] !=0) {
						size1++; 
						
					}
				}
				
			}
		  
		  int size2 =0; 
		  for(int row =0; row<inputArray1.length; row++) {
				for(int col =0; col<inputArray1[0].length; col++) {
					
					
					if(inputArray1[row][col] !=0) {
						size2++; 
						
					}
				}
				
			}
		  
	      
		  int [][] compactMatrix1 = sparse1.compactMatrix(inputArray1, size1);
		  int [][] compactMatrix2 = sparse1.compactMatrix(inputArray2, size2);
		  
		  
		  
		  
		  int [][] expectedResult1 = { { 2,2},{4,4} };
		  
		  
		  int [][] actualResult1 = sparse1.additionOfMatrix(compactMatrix1, compactMatrix2, size1, size2); 
		  
		  Assertions.assertArrayEquals(expectedResult1, actualResult1);
		
		
		
	}
	
	@Test
	public void multiplication() {
		
	}
	
	

}
