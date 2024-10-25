package assignment4.ques3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NQueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of Chess board  N*N");
		int size = sc.nextInt();
		
	    
	    NQueenService service = new NQueenService();
	    
	    List < List < String >> queen = service.solveNQueens(size);
	    
	    int index = 1;
        for (List < String > it: queen) {
            System.out.println("Arrangement " + index);
            for (String s: it) {
                System.out.println(s);
            }
            System.out.println();
            index += 1;
        }
	    
	}

}
