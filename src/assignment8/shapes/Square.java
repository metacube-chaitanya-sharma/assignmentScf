package assignment8.shapes;

import java.util.List;

import assignment8.Point;
import assignment8.Shape;
import assignment8.ShapeType;

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

	/** this method will return that a function is inside  or outside
	 * @param checkPoint is the point which is inside or outside of shape
	 */
	public boolean isPointEnclosed(Point checkPoint) {
		// TODO Auto-generated method stub

		int originX = point.getX();		
		int originY = point.getY();	
		
	
		
		int originDistanceX = point.getX() + parameters.get(0);
		int originDistanceY = point.getY() + parameters.get(0);
		
		
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
		return ShapeType.SQUARE;
	}
	
	public List<Integer> getParameters() {
		
		return parameters; 
	}

}
