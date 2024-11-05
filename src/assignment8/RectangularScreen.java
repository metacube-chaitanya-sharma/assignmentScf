package assignment8;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class RectangularScreen implements Screen {
	
	public int xMax; 
	public int yMax;
	 
	
	List<Shape> listOfShape = new ArrayList<Shape>();
	
	

	public RectangularScreen(  int xMax, int yMax) {
		super();
		
		this.xMax = xMax;
		this.yMax = yMax;
	}
	

	public int getxMax() {
		return xMax;
	}

	public int getyMax() {
		return yMax;
	}




	@Override
	public void addShape(Shape shape) {
		// TODO Auto-generated method stub
		
		if(shape == null) {
			return ;
		}
		
		 if(shape.isPointEnclosed()) {
			 Timestamp instant = Timestamp.from(Instant.now()); 
			 listOfShape.add(shape);
		 }
		

	}

	@Override
	public void deleteShape(Shape shape) {
		// TODO Auto-generated method stub
		
		if(shape == null) {
			return ; 
		}
		
		if(listOfShape.contains(shape)) {
			listOfShape.remove(shape); 
		}

	}

	@Override
	public void deleteAllShape() {
		// TODO Auto-generated method stub
		
		listOfShape.removeAll(listOfShape);

	}

	@Override
	public void shapesInAscendingOrder() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Shape> shapeObjects() {
		// TODO Auto-generated method stub
		
		
		return null;
	}

}
