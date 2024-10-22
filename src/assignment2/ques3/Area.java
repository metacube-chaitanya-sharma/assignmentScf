package assignment2.ques3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		// for the triangle area
		TriangleArea triangle= new TriangleArea(3,4);
		System.out.println("Area of Triangle " + triangle.area());
		
		// for the rectangle area
		RectangleArea rectangle = new RectangleArea(4,5);
		System.out.println("Area of Rectangle " + rectangle.area());
		
		// for the square area
		SquareArea square = new SquareArea(4);
		System.out.println("Area of Square " + square.area());
		
		// for the circle area
		CircleArea circle = new CircleArea(4);
		System.out.println("Area of Circle " + circle.area());

		
	}

}
