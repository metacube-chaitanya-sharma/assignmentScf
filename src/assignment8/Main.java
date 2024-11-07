package assignment8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String str = "SQUARE";
		
		
		Screen screen = new Screen(100,100);
		
		// we have to give the length of the side
		List<Integer> squareParameters = new ArrayList<Integer>(Arrays.asList(3));
		// we have to give the length of the radius
		List<Integer> circleParameters = new ArrayList<Integer>(Arrays.asList(2));
		// we have to give the length of the two sides of rectangle
		List<Integer> rectangleParameters = new ArrayList<Integer>(Arrays.asList(5,2));
		
		
		// gives the coordinates of the triangle and regularPolygon
		List<Integer> triangleParameters = new ArrayList<Integer>(Arrays.asList(2,3,4,5,1,6));
	    List<Integer> regularPolygonParameters = new ArrayList<Integer>(Arrays.asList(4,10,9,7,11,2));

		
		
		// this point is the origin of the shape
		Point squarePoint = new Point(2,3);
		Point circlePoint = new Point(1,4);
		Point rectanglePoint = new Point(2,3);
		Point trianglePoint = new Point(3,6);
		Point regularPolygonPoint = new Point(2,2);
		
		
		// From this we can create the different shapes
		Shape square = ShapeFactory.createShape(ShapeType.SQUARE , squarePoint, squareParameters);
		Shape circle = ShapeFactory.createShape(ShapeType.CIRCLE , circlePoint, circleParameters);
		Shape circle1 = ShapeFactory.createShape(ShapeType.CIRCLE , circlePoint, circleParameters);
		Shape rectangle = ShapeFactory.createShape(ShapeType.RECTANGLE , rectanglePoint, rectangleParameters);
		Shape triangle = ShapeFactory.createShape(ShapeType.TRIANGLE , trianglePoint, triangleParameters);
		Shape regularPolygon = ShapeFactory.createShape(ShapeType.REGULARPOLYGON , regularPolygonPoint, regularPolygonParameters);
		
		
		// this is point for checking point is inside or not 
//		Point squareCheckPoint = new Point(3,4);
//		
//		System.out.println(square.getArea());
//		Point point = square.getOrigin();
//		System.out.println(point.x + " " +point.y);
//		System.out.println(square.getPerimeter());
//		System.out.println(square.isPointEnclosed(squareCheckPoint));
		
//		this is point for checking point is inside or not 
//		Point circleCheckPoint = new Point(2,3);
//		
//		System.out.println(circle.getArea());
//		Point point = circle.getOrigin(); 
//		System.out.println(point.x + " " + point.y);
//		
//		System.out.println(circle.getPerimeter());
//		System.out.println(circle.isPointEnclosed(circleCheckPoint));
		
		
//		this is point for checking point is inside or not 
//		Point rectangleCheckPoint = new Point(2,3);
//		
//		System.out.println(rectangle.getArea());
//		Point point = rectangle.getOrigin(); 
//		System.out.println(point.x + " " + point.y);
//		
//		System.out.println(rectangle.getPerimeter());
//		System.out.println(rectangle.isPointEnclosed(rectangleCheckPoint));
		
		
//		this is point for checking point is inside or not 
//		Point triangleCheckPoint = new Point(2,3);
//		
//		System.out.println(triangle.getArea());
//		Point point = triangle.getOrigin(); 
//		System.out.println(point.x + " " + point.y);
//		
//		System.out.println(triangle.getPerimeter());
//		System.out.println(triangle.isPointEnclosed(triangleCheckPoint));
		
		
		
//		this is point for checking point is inside or not 
//		Point regularPolygonCheckPoint = new Point(6,4);
//		
//		System.out.println(regularPolygon.getArea());
//		Point point = regularPolygon.getOrigin(); 
//		System.out.println(point.x + " " + point.y);
//		
//		System.out.println(regularPolygon.getPerimeter());
//		System.out.println(regularPolygon.isPointEnclosed(regularPolygonCheckPoint));
		
		
		
		
		
		
		// from this we can add the shape into the screen
		screen.addShape(square);
		screen.addShape(circle);
		screen.addShape(circle1);
		screen.addShape(rectangle);
		screen.addShape(triangle);
		screen.addShape(regularPolygon);
		
		
		
		
		
//		List<Shape> sortedArea = screen.sortedInAreaOrder();
//		for(Shape shape : sortedArea) {
//			System.out.println(shape.getShapeType());
//		}
		System.out.println("before: ");
		List<Shape> beforeShapes = screen.showShapes();
		for(Shape shape : beforeShapes) {
			System.out.println(shape.getShapeType());
		}
		
//		screen.deleteShape(rectangle);
		
		screen.deleteAllShape(ShapeType.CIRCLE);
		
		System.out.println(" ");
		System.out.println("All Shapes :");
		
		System.out.println("after: ");
		List<Shape> AfterShapes = screen.showShapes();
		for(Shape shape : AfterShapes) {
			System.out.println(shape.getShapeType());
		}
		
		
		List<Shape> sortedArea = screen.sortedInAreaOrder();
		for(Shape shape : sortedArea) {
			System.out.println(shape.getShapeType());
		}
		
		
		List<Shape> sortedPerimeter = screen.sortedInPerimeterOrder();
		for(Shape shape : sortedPerimeter) {
			System.out.println(shape.getShapeType());
		}
		
		List<Shape> sortedOriginDistance = screen.sortedInOriginDistanceOrder();
		for(Shape shape : sortedOriginDistance ) {
			System.out.println(shape.getShapeType());
		}
		
		
//		
//		
//		System.out.println(" ");
//		System.out.println("TimeStamp : ");
		
//		List<Shape> timeStamp = screen.sortedInTimeStampOrder();
//		for(Shape shape : timeStamp) {
//			System.out.println(shape.getShapeType());
//		}
//		System.out.println(" ");
		
		

		
		
		

	}

}
