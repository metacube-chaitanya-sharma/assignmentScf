package assignment2.ques3;

public class CircleArea implements Shape {

	
	private double radius;
	
	/**
	 * set the values
	 * @param radius
	 */
	public CircleArea(double radius) {
		super();
		this.radius = radius;
	}

	/**
	 *  calculate the area of circle
	 */
	public double area() {
		// TODO Auto-generated method stub
		return (3.14*radius*radius);
	}

}
