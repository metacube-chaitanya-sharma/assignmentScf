package assignment2.ques2;

import java.util.ArrayList;

public class MarksheetService {
	
	/**
	 * return average of all grades
	 * @param grades input array having marks of student
	 * @return average value of All grades
	 */
	public float averageAllGrades(ArrayList<Integer> grades) {
		
		int len = grades.size();
		
		if(len <= 0) {
			 throw new ArithmeticException("enter the number of student greater than zero");   
		}
		
		 float res = 0.00f; 
		
		for(int i=0; i<len; i++) {
			
			res += grades.get(i);
		}
		
		try {
		res = res/len; 
		
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			
		}
		
		return res;
		
	}
	
	/**
	 *  the maximum grade
	 * @param grades
	 * @return maximum value
	 */
	public Integer maximumGrade(ArrayList<Integer> grades) {
		
		int len = grades.size();
		
		if(len == 0) {
			return null; 
		}
		
		Integer res = -1; 
		
		for(int i=0; i<len; i++) {
			
			if(grades.get(i) > res) {
				res = grades.get(i);
			}
		}
		
		return res; 
	}
	
	/**
	 * minimum grade 
	 * @param grades
	 * @return minimum value
	 */
	public Integer minimumGrade(ArrayList<Integer> grades) {
		
		int len = grades.size();
		
		if(len == 0) {
			return null; 
		}
		int res = 9999; 
		
		for(int i=0; i<len; i++) {
			
			if(grades.get(i) < res) {
				res = grades.get(i);
			}
		}
		
		return res; 
	}
	
	/**
	 * the passed Student Percentage
	 * @param grades
	 * @return passed student percentage
	 */
	public float passedStudentPercentage(ArrayList<Integer> grades) {
		
		int len = grades.size();
		if(len <= 0) {
			 throw new ArithmeticException("enter the number of student greater than zero");   
		}
		float res =0.00f; 
		
		int numOfStudent = 0; 
		for(int i=0; i<len; i++) {
			
			if(grades.get(i) >= 40) {
				numOfStudent++; 
			}
		}
		try {
			res = ((float)(numOfStudent)/(float)(len) * 100.00f); 
			}
			catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		
		return res; 
		
	}

}
