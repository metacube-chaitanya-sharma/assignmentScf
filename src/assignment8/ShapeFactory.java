package assignment8;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import assignment8.shapes.Circle;
import assignment8.shapes.Rectangle;
import assignment8.shapes.RegularPolygon;
import assignment8.shapes.Square;
import assignment8.shapes.Triangle;


public class ShapeFactory {
	
	public static Shape createShape(ShapeType shapeType  , Point point , List<Integer> parameters ) {

		Shape shape = null; 
		
	
		
		switch(shapeType) {
		
		case SQUARE: 
			shape = new Square(point , parameters);
			 
			break; 
			
		case CIRCLE:
			shape = new Circle(point , parameters);
			
			break; 
		
		case RECTANGLE:
			shape = new Rectangle(point , parameters);
			 
			break; 
		
		case TRIANGLE:
			shape = new Triangle(point , parameters);
			
			break; 
			
		case REGULARPOLYGON:
			shape = new RegularPolygon(point, parameters);
			
			break; 
		}
		
		if(shape != null) {
		  
		}
		
	
		
		
		return shape; 
}
}
