package assignment8.shapes;

import java.util.List;

import assignment8.Point;
import assignment8.Shape;
import assignment8.ShapeType;

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

	/** this method will return that a function is inside  or outside
	 * @param checkPoint is the point which is inside or outside of shape
	 */
	public boolean isPointEnclosed(Point checkPoint) {
		// TODO Auto-generated method stub
		
		
		int originX = point.getX();		
		int originY = point.getY();	
	
		int radius = point.getX() + parameters.get(0);
		
		
		int distance = (int)  Math.sqrt(Math.pow((checkPoint.getX() - originX), 2)
                + Math.pow((checkPoint.getY() - originY), 2));
		
		if(distance > radius) {
			return false; 
		}
		
		return true; 

		
	}

	@Override
	public ShapeType getShapeType() {
		// TODO Auto-generated method stub
		return ShapeType.CIRCLE;
	}
	
	public List<Integer> getParameters() {
		
		return parameters; 
	}

}
