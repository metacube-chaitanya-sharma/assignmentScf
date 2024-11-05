package assignment8.shapes;

import java.util.ArrayList;
import java.util.List;

import assignment8.Point;
import assignment8.Shape;

public class Circle implements Shape {
	
	private Point point;
	private List<Integer> parameters; 
	

	public Circle(Point point, List<Integer> parameters) {
		super();
		this.point = point;
		this.parameters = parameters;
	}

	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		
		int radius = parameters.get(0);
		
		return (int) (3.14 * radius * radius);
		
		
	}

	@Override
	public int  getPerimeter() {
		// TODO Auto-generated method stub
		int radius = parameters.get(0);
		
		return (int)( 2 * 3.14 * radius);
	}

	@Override
	public Point getOrigin() {
		// TODO Auto-generated method stub
		return point; 
	}

	@Override
	public boolean isPointEnclosed() {
		// TODO Auto-generated method stub
		
		int minX = point.getX();
		int minY = point.getY();
		
		int maxX = point.getX() + parameters.get(0);
		int maxY = point.getY() + parameters.get(0);
		
		if(maxX > minX && maxY > minY) {
			return true; 
		}
		return false; 
		
	}

}
