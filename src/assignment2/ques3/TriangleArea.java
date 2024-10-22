package assignment2.ques3;

public class TriangleArea implements Shape {
	
	private double width; 
	private double height; 

    /**
     * set the values
     * @param width
     * @param height
     */
	public TriangleArea(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	/**
	 * calculate the triangle area
	 */
	public double area() {
		
		return (0.5 * width * height);
		
	}
	
}
