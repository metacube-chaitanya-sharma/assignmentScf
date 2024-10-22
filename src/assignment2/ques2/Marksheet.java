package assignment2.ques2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Marksheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner sc = new Scanner(System.in);
		
		// Number of Student
		System.out.println("enter the number of Student");
		int numberOfStudent = sc.nextInt();
		
		// having the marks of student in this ArrayList
		ArrayList<Integer> grades = new ArrayList<Integer>();
		
		// take the input from the user
		for(int i=0; i<numberOfStudent; i++) {
			System.out.println("Enter the grades of student "+(i+1)+" from 0 to 100");
			int num = sc.nextInt(); 
			if(num >= 0 && num <=100) {
			grades.add(sc.nextInt());
			}
			else {
				throw new ArithmeticException("enter the marks should be greater or equal to  0 and less than or equal to 100");
			}
		}
		
		MarksheetService service = new MarksheetService();
		
		System.out.println("average of All grades-> " + Float.valueOf(df.format(service.averageAllGrades(grades)))); 
		System.out.println("maximum Grade-> " + service.maximumGrade(grades));
		System.out.println("minimum Grade-> " +service.minimumGrade(grades));
		System.out.println("passed Student Percentage-> " + Float.valueOf(df.format(service.passedStudentPercentage(grades))));
		
		
		
		
		
	}

}
