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
	
	/**
	 * this is used to calculate the distance between the two points
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
	public int getPerimeter() {
		// TODO Auto-generated method stub
		 
		int noOfSides = parameters.size()/2 + 1; 
		int distanceOfSide = distance(point.getX() , point.getY() 
				, parameters.get(0) , parameters.get(1));
		
	
		return noOfSides * distanceOfSide; 
		
	}
	/**
	 * this is used to calculate the area of the triangle
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @param x3
	 * @param y3
	 * @return
	 */
	public int getTrianglesArea(int x1, int y1, int x2, int y2,
            int x3, int y3) {
		
		return (int) Math.abs((x1*(y2-y3) + x2*(y3-y1)+
                x3*(y1-y2))/2);
	}
	
	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		
	      int area = 0;
	         for(int i=0; i<parameters.size()-2; i=i+2){
	        area += getTrianglesArea(point.x, point.y, parameters.get(i), parameters.get(i+1), parameters.get(i+2), parameters.get(i+3));
	         }

	        return (int)area; 
		
		
	 
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
		
		int  initialArea = getTrianglesArea(checkPoint.x, checkPoint.y, point.x, point.y, parameters.get(0), parameters.get(1));
		
        int remaingArea = 0;
        for(int i=2; i<parameters.size()-1; i=i+2){
           remaingArea += getTrianglesArea(checkPoint.x, checkPoint.y,
        		   parameters.get(i-2), parameters.get(i-1), parameters.get(i),parameters.get(i+1));
        }
        
        int lastArea = getTrianglesArea(checkPoint.x , checkPoint.y , point.x , point.y , parameters.get(parameters.size()-2) , parameters.get(parameters.size()-1));
        int totalArea = getArea();
        
        if(initialArea + remaingArea + lastArea == totalArea){
           return true;
        }
        return false;
	
		
		  
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
