package assignment8.shapes;

import java.util.List;

import assignment8.Point;
import assignment8.Shape;
import assignment8.ShapeType;

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
	public boolean isPointEnclosed(Point checkPoint) {
		// TODO Auto-generated method stub
		
		int originX = point.getX();		
		int originY = point.getY();	
		
	
		
		int originDistanceX = point.getX() + parameters.get(0);
		int originDistanceY = point.getY() + parameters.get(1);
		
		
		int p1 = checkPoint.getX();
		int p2 = checkPoint.getY();
		
		if(originX < p1 && originY < p2 &&  originDistanceX > p1 && originDistanceY > p2 ) {
			return true; 
		}
		return false; 
	}
	
	@Override
	public ShapeType getShapeType() {
		// TODO Auto-generated method stub
		return ShapeType.RECTANGLE;
	}
	
	public List<Integer> getParameters() {
		
		return parameters; 
	}

}
