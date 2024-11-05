package assignment8;

import java.util.List;

public interface Screen {
	
	public void  addShape(Shape shape);
	
	public void deleteShape(Shape shape);
	
	public void deleteAllShape();
	
	public void shapesInAscendingOrder();
	
	public List<Shape> shapeObjects();

}
