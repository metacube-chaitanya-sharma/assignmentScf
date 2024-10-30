package assignment6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import junit.framework.AssertionFailedError;

public final class SparseMatrices {
	
	private int[][] arr; 
	private int rowSize; 
	private int colSize; 

	public SparseMatrices(int[][] arr , int rowSize , int colSize) {
		// TODO Auto-generated constructor stub
		this.arr =arr; 
		this.rowSize = rowSize; 
		this.colSize = colSize; 
		
	}
	
	/**
	 * Method is used to print the matrix
	 * @param res
	 */
	public void printMatrix(int[][] res) {
		
		
          for(int index =0; index<res.length; index++) {
			
			for(int j =0; j<res[0].length; j++) {
				System.out.print( res[index][j] + " "  );
			}
			System.out.println("");
		}
	}
	
	public void printCompactMatrix(int [][] compactMatrix , int size) {
		
		for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < size; j++) 
            {
            	
                System.out.printf("%d ", compactMatrix[i][j]);
                
            }
            
            System.out.printf("\n");
        }
	}
	

	
	/**
	 * 
	 * @param inputArr
	 * @param size
	 * @return
	 */
	public int[][] compactMatrix(int [][] inputArr , int size){
		
               int compactMatrix[][] = new int[3][size];
		
		int k = 0;
        for (int i = 0; i < rowSize; i++) 
        {
            for (int j = 0; j < colSize; j++)
            {
                if (inputArr[i][j] != 0) 
                {
                    compactMatrix[0][k] = i;
                    compactMatrix[1][k] = j;
                    compactMatrix[2][k] = inputArr[i][j];
                    k++;
                }
            }
        }
        return compactMatrix; 
	}
	
	
	
	/**
	 * Method is used to return the transpose matrix of inputArray
	 * @return
	 */
	public int[][] transpose(int [][] compactMatrix , int size){

		
		 int [][] ans = new int[colSize][rowSize];
		 
		 
	    
	            for (int j = 0; j < size; j++) 
	            {
	                                         
              ans[compactMatrix[1][j]][compactMatrix[0][j]] = compactMatrix[2][j]; 
	                
	                
	            }
		
		return ans; 
	}
	
	/**
	 * Method is used to find the A = A^T
	 * @return
	 */
	public boolean symmetricMatrix(int[][] compactMatrix , int size) {
		
		if(arr.length != arr[0].length){
			return false; 
		}
		
		int [][] res = transpose(compactMatrix ,size);
		
		for(int index =0; index <arr.length; index++) {
			
			for(int innerIndex =0; innerIndex<arr[0].length; innerIndex++) {
				
				if(res[index][innerIndex] != arr[index][innerIndex]) return false; 
			}
		}
		
		return true; 
		
		
	}
	
	/**
	 * Method is used to find the sum of two matrices
	 * @param inputArray
	 * @return
	 */
	public int[][] additionOfMatrix(int [][] compactMatrix1 , int [][] compactMatrix2 , int size1 , int size2){
		
		int [][] ans = new int[rowSize][colSize];
		
            for (int j = 0; j < size1; j++) 
            {
                
             ans[compactMatrix1[0][j]][compactMatrix1[1][j]] = compactMatrix1[2][j];
                
               
                
            }
       
            for (int j = 0; j < size2; j++) 
            {
            	
                ans[compactMatrix2[0][j]][compactMatrix2[1][j]] = 
                		ans[compactMatrix2[0][j]][compactMatrix2[1][j]] + compactMatrix2[2][j];
                
                          
            }
      
		return ans; 
		
	}
	
	

	/**
	 * Method is used to multiply the two matrices
	 * @param inputArray
	 */
	public int[][]  multiplication(SparseMatrices sparse ,int [][] compactMatrix1 , int [][] compactMatrix2 ){
		
		int row1 = rowSize; 
		int col1 = colSize; 
		
		int row2 = sparse.rowSize; 
		int col2 = sparse.colSize; 
		
		
		
		int [][] ans = new int[row1][col2];
		
		try {
			
			if(col1 != row2) {
				 throw new AssertionError(); 
			}
			
			        for (int i = 0; i< compactMatrix1[0].length; i++) {
			        	  int rowA = compactMatrix1[0][i]; 
			        	  int colA = compactMatrix1[1][i]; 
			        	  int valueA = compactMatrix1[2][i]; 
			        	  
			        	for(int j =0; j< compactMatrix2[0].length; j++) {
			        		
			        		 int rowB = compactMatrix2[0][j]; 
				        	  int colB = compactMatrix2[1][j]; 
				        	  int valueB = compactMatrix2[2][j];
				        	  
				        	  if(colA == rowB) {
				        		  ans[rowA][colB] += valueA * valueB; 
				        	  }
			        		
			        	}
			        }
			        	
			      
			
		}
		catch(AssertionError e) {
			System.out.println("enter the valid matrices");
		}
		return ans; 
		
	}
		
}
