package assignment8;

import java.util.List;

public interface Shape {
	
	
	
	public int getArea();
	public int getPerimeter();
	public Point getOrigin();
	public boolean isPointEnclosed(Point checkPoint);
	public ShapeType getShapeType();
	public List<Integer> getParameters();

}
