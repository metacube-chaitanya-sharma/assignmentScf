package assignment8.shapes;

import java.util.List;

import assignment8.Point;
import assignment8.Shape;
import assignment8.ShapeType;

public class RegularPolygon implements Shape {
	
	private Point point;
	private List<Integer> parameters; 
	

	public RegularPolygon(Point point, List<Integer> parameters) {
		super();
		this.point = point;
		this.parameters = parameters;
	}
	
	
	@Override
	public int getPerimeter() {
		// TODO Auto-generated method stub
		int sum =0; 
		for(Integer index : parameters) {
			sum += index; 
		}
		return sum; 
	}
	
	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		
		int perimeter = getPerimeter();
		
		int numberOfSide = parameters.size();
		int lengthOfOneSide = parameters.get(1);
		double degree = 180/numberOfSide; 
		
		
		double apothem = (lengthOfOneSide) / (2 * Math.tan(degree));
		double area = (perimeter * apothem) /2; 
		
		return (int) area; 
	}

	@Override
	public Point getOrigin() {
		// TODO Auto-generated method stub
		
		return point; 
	}

	@Override
	public boolean isPointEnclosed() {
		// TODO Auto-generated method stub
		  
	}
	
	@Override
	public ShapeType getShapeType() {
		// TODO Auto-generated method stub
		return ShapeType.REGULARPOLYGON;
	}
	
	public List<Integer> getParameters() {
		
		return parameters; 
	}

}
