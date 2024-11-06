package assignment8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String str = "SQUARE";
		
		
		Screen screen = new Screen(100,100);
		
		List<Integer> squareParameters = new ArrayList<Integer>(Arrays.asList(3));
		List<Integer> circleParameters = new ArrayList<Integer>(Arrays.asList(2));
		List<Integer> rectangleParameters = new ArrayList<Integer>(Arrays.asList(5,2));
		List<Integer> triangleParameters = new ArrayList<Integer>(Arrays.asList(2,3,4,5,1,6));
	List<Integer> regularPolygonParameters = new ArrayList<Integer>(Arrays.asList(4,10,9,7,11,2));
//		List<Integer> regularPolygonParameters = new ArrayList<Integer>(Arrays.asList(4,5,7,8,6,2));
//		List<Integer> regularPolygonParameters = new ArrayList<Integer>(Arrays.asList(0,3,3,3,3,0));
		
		
		
		Point squarePoint = new Point(2,3);
		Point circlePoint = new Point(1,4);
		Point rectanglePoint = new Point(2,3);
		Point trianglePoint = new Point(3,6);
		Point regularPolygonPoint = new Point(2,2);
		
		
		
		Shape square = ShapeFactory.createShape(ShapeType.SQUARE , squarePoint, squareParameters);
		Shape circle = ShapeFactory.createShape(ShapeType.CIRCLE , circlePoint, circleParameters);
		Shape circle1 = ShapeFactory.createShape(ShapeType.CIRCLE , circlePoint, circleParameters);
		Shape rectangle = ShapeFactory.createShape(ShapeType.RECTANGLE , rectanglePoint, rectangleParameters);
		Shape triangle = ShapeFactory.createShape(ShapeType.TRIANGLE , trianglePoint, triangleParameters);
		Shape regularPolygon = ShapeFactory.createShape(ShapeType.REGULARPOLYGON , regularPolygonPoint, regularPolygonParameters);
		
		
		
//		Point squareCheckPoint = new Point(3,4);
//		
//		System.out.println(square.getArea());
//		Point point = square.getOrigin();
//		System.out.println(point.x + " " +point.y);
//		System.out.println(square.getPerimeter());
//		System.out.println(square.isPointEnclosed(squareCheckPoint));
		
		
//		Point circleCheckPoint = new Point(2,3);
//		
//		System.out.println(circle.getArea());
//		Point point = circle.getOrigin(); 
//		System.out.println(point.x + " " + point.y);
//		
//		System.out.println(circle.getPerimeter());
//		System.out.println(circle.isPointEnclosed(circleCheckPoint));
		
		
		
//		Point rectangleCheckPoint = new Point(2,3);
//		
//		System.out.println(rectangle.getArea());
//		Point point = rectangle.getOrigin(); 
//		System.out.println(point.x + " " + point.y);
//		
//		System.out.println(rectangle.getPerimeter());
//		System.out.println(rectangle.isPointEnclosed(rectangleCheckPoint));
		
		
	
//		Point triangleCheckPoint = new Point(2,3);
//		
//		System.out.println(triangle.getArea());
//		Point point = triangle.getOrigin(); 
//		System.out.println(point.x + " " + point.y);
//		
//		System.out.println(triangle.getPerimeter());
//		System.out.println(triangle.isPointEnclosed(triangleCheckPoint));
		
		
		
		
//		Point regularPolygonCheckPoint = new Point(6,4);
//		
//		System.out.println(regularPolygon.getArea());
//		Point point = regularPolygon.getOrigin(); 
//		System.out.println(point.x + " " + point.y);
//		
//		System.out.println(regularPolygon.getPerimeter());
//		System.out.println(regularPolygon.isPointEnclosed(regularPolygonCheckPoint));
		
		
		
		
		
		
		
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
		List<Shape> listShapes = screen.showShapes();
		for(Shape shape : listShapes) {
			System.out.println(shape.getShapeType());
		}
		
//		screen.deleteShape(rectangle);
		
		screen.deleteAllShape(ShapeType.CIRCLE);
		
		System.out.println(" ");
		System.out.println("All Shapes :");
		
		System.out.println("after: ");
		List<Shape> listShapes1 = screen.showShapes();
		for(Shape shape : listShapes1) {
			System.out.println(shape.getShapeType());
		}
//		
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
