package assignment8.shapes;

import java.util.List;

import assignment8.Point;
import assignment8.Shape;

public class Square implements Shape {
	
	private Point point;
	private List<Integer> parameters; 
	

	public Square(Point point, List<Integer> parameters) {
		super();
		this.point = point;
		this.parameters = parameters;
	}

	@Override
	public int getArea() {
		// TODO Auto-generated method st
		int side = parameters.get(0);
		
		return side*side; 
	}

	@Override
	public int getPerimeter() {
		// TODO Auto-generated method stub
		
		int side = parameters.get(0);
		return 4*side; 
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
