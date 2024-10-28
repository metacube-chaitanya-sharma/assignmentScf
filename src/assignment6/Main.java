package assignment6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		int [][] arr1 = { { 1, 2, 1 },
                { 2, 2, 4 },
                { 7, 3, 3 },
                { 4, 5, 4 } }; 
		
		int [][] arr2 = { { 1, 3, 1, 9 },
                { 1, 2, 5, 7 },
                { 4, 5, 3, 6 } };
		
		
		
		SparseMatrices sparse1 = new SparseMatrices(arr1);
		SparseMatrices sparse2 = new SparseMatrices(arr2);
		
		
		 sparse1.printMatrix(sparse1.transpose());
		 System.out.println(sparse1.symmetricMatrix()); 
		 
		 sparse1.additionOfMatrix(sparse2);
		 sparse1.multiplication(sparse2);

	}

}
