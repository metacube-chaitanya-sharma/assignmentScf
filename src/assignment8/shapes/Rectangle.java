package assignment8.shapes;

import java.util.List;

import assignment8.Point;
import assignment8.Shape;

public class Rectangle implements Shape {
	
	private Point point;
	private List<Integer> parameters; 
	

	public Rectangle(Point point, List<Integer> parameters) {
		super();
		this.point = point;
		this.parameters = parameters;
	}

	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		
		int length = parameters.get(0);
		int breadth = parameters.get(1);
		return length * breadth; 
	}

	@Override
	public int getPerimeter() {
		// TODO Auto-generated method stub
		int length = parameters.get(0);
		int breadth = parameters.get(1);
		return 2 * (length + breadth); 
	}

	@Override
	public Point getOrigin() {
		// TODO Auto-generated method stub
		
		return point; 
		
	}

	@Override
	public boolean isPointEnclosed() {
		// TODO Auto-generated method stub
		
		return false; 
	}

}
