package assignment2.ques3;

public class RectangleArea implements Shape{
	
	private double width; 
	private double height;
	
	
	/**
	 * set the values
	 * @param width
	 * @param height
	 */
    public RectangleArea(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}


    /** 
     * calculate the area of rectangle
     */
	public double area() {
		
		return width * height; 
	}

}
