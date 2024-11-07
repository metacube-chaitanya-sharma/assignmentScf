package assignment8.shapes;

import java.util.List;

import assignment8.Point;
import assignment8.Shape;
import assignment8.ShapeType;

public class Triangle implements Shape {
	
	private Point point;
	private List<Integer> parameters; 
	

	public Triangle(Point point, List<Integer> parameters) {
		super();
		this.point = point;
		this.parameters = parameters;
	}
	/**
	 * Method is used to calculate the distance b/w two points
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @return
	 */
	public int distance(int x1, int y1 , int x2 ,int y2 ) {
		
		return (int ) Math.sqrt(Math.pow((x2 - x1), 2)
                + Math.pow((y2 - y1), 2));
		
	}

	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		
		
		
		int x1 = point.getX(); 
		int y1 = point.getY();
		
		int x2 = parameters.get(0);
		int y2 = parameters.get(1);
		
		int x3 = parameters.get(2);
		int y3 = parameters.get(3);
		
		
		
		int area = (int) 0.5 * Math.abs(x1 * (y2 -y3) +  x2 * (y3 -y1) + x3 * (y1 - y2));
		
		return area; 
	}

	@Override
	public int getPerimeter() {
		// TODO Auto-generated method stub
		
		int x1 = point.getX(); 
		int y1 = point.getY();
		
		int x2 = parameters.get(0);
		int y2 = parameters.get(1);
		
		int x3 = parameters.get(2);
		int y3 = parameters.get(3);
		
		int lenght = distance(x1 ,y1 ,x2 , y2);
		int weight = distance(x2 , y2 , x3 ,y3);
		int hypo = distance(x3, y3 , x1, y1);
		
	
		return lenght + weight + hypo; 
	}

	@Override
	public Point getOrigin() {
		// TODO Auto-generated method stub
		
		return point; 
		
	}
	 /**
	  * this is used to calculate the area of triangle
	  * @param x1
	  * @param y1
	  * @param x2
	  * @param y2
	  * @param x3
	  * @param y3
	  * @return
	  */
	public int triangleArea(int x1, int y1, int x2, int y2,
            int x3, int y3) {
		
		return (int) Math.abs((x1*(y2-y3) + x2*(y3-y1)+
                x3*(y1-y2))/2);
	}

	/** this method will return that a function is inside  or outside
	 * @param checkPoint is the point which is inside or outside of shape
	 */
	public boolean isPointEnclosed(Point checkPoint) {
		
		
		int x = checkPoint.getX();
		int y = checkPoint.getY();
		
		
		int x1 = point.getX();
		int y1 = point.getY();
		
		int x2 = parameters.get(0);
		int y2 = parameters.get(1);
		
		int x3 = parameters.get(2);
		int y3 = parameters.get(3);
		
		/* Calculate area of triangle ABC */
        int A = triangleArea(x1, y1, x2, y2, x3, y3);
        
        /* Calculate area of triangle PBC */ 
        int A1 = triangleArea(x, y, x2, y2, x3, y3);
        
        /* Calculate area of triangle PAC */ 
        int A2 = triangleArea(x1, y1, x, y, x3, y3);
        
        
        /* Calculate area of triangle PAB */  
        int A3 = triangleArea(x1, y1, x2, y2, x, y);
        
        return (A == A1 + A2 + A3);
		
		
		
	}
	
	@Override
	public ShapeType getShapeType() {
		// TODO Auto-generated method stub
		return ShapeType.TRIANGLE;
	}
	
	public List<Integer> getParameters() {
		
		return parameters; 
	}

}
