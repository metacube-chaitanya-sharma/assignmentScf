package assignment8.shapes;

import java.util.List;

import assignment8.Point;
import assignment8.Shape;

public class Triangle implements Shape {
	
	private Point point;
	private List<Integer> parameters; 
	

	public Triangle(Point point, List<Integer> parameters) {
		super();
		this.point = point;
		this.parameters = parameters;
	}

	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		
		int height = parameters.get(0);
		int weight = parameters.get(1);
		
		return (int) (0.5 * height * weight); 
	}

	@Override
	public int getPerimeter() {
		// TODO Auto-generated method stub
		
		int height = parameters.get(0);
		int weight = parameters.get(1);
		int hypo = parameters.get(2);
		
	
		return height + weight + hypo; 
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
