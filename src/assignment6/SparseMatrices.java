package assignment6;

import junit.framework.AssertionFailedError;

final class SparseMatrices {
	
	private int[][] arr; 

	public SparseMatrices(int[][] arr) {
		// TODO Auto-generated constructor stub
		this.arr =arr; 
		
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
	
	/**
	 * Method is used to return the transpose matrix of inputArray
	 * @return
	 */
	public int[][] transpose(){
		
		int [][] res = new int[arr[0].length][arr.length];
		
		for(int index=0; index<arr.length; index++) {
			
			for(int innerIndex=0;  innerIndex<arr[0].length;  innerIndex++) {
				
				res[innerIndex][index] = arr[index][innerIndex];
				
			}
		}
		
		return res; 
	}
	
	/**
	 * Method is used to find the A = A^T
	 * @return
	 */
	public boolean symmetricMatrix() {
		
		if(arr.length != arr[0].length){
			return false; 
		}
		
		int [][] res = transpose();
		
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
	public void additionOfMatrix(SparseMatrices inputArray){
		
		int [][] res = new int[arr.length][arr[0].length];
		
		try {
			
		
		
		if(arr.length != inputArray.arr.length && arr[0].length != inputArray.arr[0].length) {
		           throw new AssertionError(); 
		}
			
			for(int index =0; index <arr.length; index++) {
				
				for(int innerIndex =0; innerIndex<arr[0].length; innerIndex++) {
					
					res[index][innerIndex] = arr[index][innerIndex] + inputArray.arr[index][innerIndex]; 
				}
			}
		
			printMatrix(res);
		}
		catch(AssertionError e) {
			System.out.println("Size must be same");
			 
		}
		catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
		
		
	}
	
	/**
	 * Method is used to multiply the two matrices
	 * @param inputArray
	 */
	public void  multiplication(SparseMatrices inputArray){
		
		int row1 = arr.length; 
		int col1 = arr[0].length; 
		
		int row2 = inputArray.arr.length; 
		int col2 = inputArray.arr[0].length; 
		
		int [][] res = new int[row1][col2];
		
		try {
			
			if(col1 != row2) {
				 throw new AssertionError(); 
			}
			
					
			
            for(int index =0; index < row1; index++) {
				
				for(int j =0; j<col2; j++) {
					
					for(int k =0; k<row2; k++) {
						

						res[index][j] += arr[index][k] * inputArray.arr[k][j]; 
					}
					
				}
			}
			
            printMatrix(res);
			
		}
		catch(AssertionError e) {
			System.out.println("enter the valid matrices");
		}
		
	}
		
		
		
		
		

	

}
