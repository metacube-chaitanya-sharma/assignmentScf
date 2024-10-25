package assignment4.ques3;

import java.util.ArrayList;
import java.util.List;

public class NQueenService {
	
	/**
	 * Method is used to check the Queen is can we place it or not
	 * at a particular place 
	 * @param board
	 * @param row
	 * @param col
	 * @return boolean value that we can place the queen or not
	 */
	public boolean validate(char[][] board , int row , int col) {
		
		int dupRow = row; 
		int dupCol = col; 
		
		// for the upper diagonal in left side
		while(row >= 0 && col >= 0) {
			if(board[row][col] == 'Q') return false; 
			row--; 
			col--; 
		}
		
		 row =dupRow ; 
		 col = dupCol ;
		// for the straight left side 
		while(col >=0) {
			
			if(board[row][col] == 'Q') return false; 
			col--; 
		}
		
		row =dupRow ; 
		col = dupCol ; 
		
		// for the lower diagonal in left side
		while(col>=0 && row < board.length) {
			if(board[row][col] == 'Q') return false; 
			
			col--; 
			row++; 
		}
		
		return true; 
		
		
	}
	/**
	 * Create the 2D array 
	 * @param board
	 * @return 
	 */
	public List<String> construct(char[][] board){
		
		List<String> res = new ArrayList<String>();
		
		for(int index =0; index<board.length; index++) {
			
			String s = new String(board[index]);
			res.add(s); 
		}
		return res; 
	}
	
	/**
	 * Check the on every column where to place the Queen 
	 * @param col
	 * @param board
	 * @param res
	 */
	public void solve(int col , char[][] board , List<List<String>> res) {
		
		if(col == board.length) {
			
			res.add(construct(board));
		    return ;
		}
		
		for(int row = 0; row < board.length; row++) {
			
			if(validate(board , row , col)) {
				board[row][col] = 'Q';
				solve(col+ 1, board , res);
				board[row][col] = '.';
			}
		}
		
	}
	/**
	 * It create empty 2D array with . char 
	 * @param size
	 * @return the 2D array with Queen placed at right place
	 */
	 public  List < List < String >> solveNQueens(int size) {
		 
	        char[][] board = new char[size][size];
	        for (int row = 0; row < size; row++)
	            for (int col = 0; col < size; col++)
	                board[row][col] = '.';
	        List < List < String >> res = new ArrayList < List < String >> ();
	        solve(0, board, res);
	        return res;
	    }

}
