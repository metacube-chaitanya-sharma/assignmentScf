package assignment6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		int [][] arr1 = { { 1, 1, 1 },
                { 2, 2, 2 },
                { 3, 3, 3 },
                { 4, 4, 4 } }; 
		
		int [][] arr2 = { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 } };
		
		
		
		SparseMatrices sparse1 = new SparseMatrices(arr1);
		
		SparseMatrices sparse2 = new SparseMatrices(arr2);
		
		
		 sparse1.transpose();
		 System.out.println(sparse1.symmetricMatrix()); 
		 
		 sparse1.additionOfMatrix(sparse2);
		 
		 sparse1.multiplication(sparse2);

	}

}
