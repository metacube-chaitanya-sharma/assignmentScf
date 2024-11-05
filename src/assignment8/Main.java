package assignment8;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String str = "SQUARE";
		
		
		Screen screen = new RectangularScreen(5,8);
		
		List<Integer> parameters = new ArrayList<Integer>();
		Point squarePoint = new Point(4,5);
		
		
		Shape square = ShapeFactory.createShape(ShapeType.SQUARE , squarePoint, parameters);
		
		
		screen.addShape(square);
//		screen.addShape(circle);
		
		
		

	}

}
