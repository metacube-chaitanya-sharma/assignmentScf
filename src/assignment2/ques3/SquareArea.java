package assignment2.ques3;

public class SquareArea implements Shape {

	
	private double width;
	
    /**
     * set the values
     * @param width
     */
	public SquareArea(double width) {
		super();
		this.width = width;
	}

	/**
	 * calculate the square area
	 */
	public double area() {
		// TODO Auto-generated method stub
	
		return (width * width);
	}

}
