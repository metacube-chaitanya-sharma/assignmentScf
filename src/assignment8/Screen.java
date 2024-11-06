package assignment8;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Screen  {
	
	public int xMax; 
	public int yMax;
	 
	
	List<Shape> listOfShape = new ArrayList<Shape>();
	
	HashMap<Shape , Integer> areaMap = new HashMap<Shape , Integer>();
	HashMap<Shape , Integer> perimeterMap = new HashMap<Shape , Integer>();
	HashMap<Shape , Integer> originDistanceMap = new HashMap<Shape , Integer>();
	TreeMap<Timestamp , Shape> timeStampMap = new TreeMap<Timestamp , Shape>();
	
	

	public Screen(int xMax, int yMax) {
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


	public boolean possibleToAdd(Shape shape) {
		
		Point point = shape.getOrigin();
		
		ShapeType shapeType = shape.getShapeType();	
		
		List<Integer> parameter = shape.getParameters(); 
		
		
		
		if(ShapeType.SQUARE.equals(shapeType)) {
			
			int originX = point.getX();
			int originY = point.getY();
			
			int maxX = originX +  parameter.get(0);
			int maxY = originY + parameter.get(0);
			
			if(xMax > maxX && yMax > maxY) {
				return true; 
			}
		}
		else if(ShapeType.RECTANGLE.equals(shapeType)) {
			
			int originX = point.getX();
			int originY = point.getY();
			
			int maxX = originX +  parameter.get(0);
			int maxY = originY + parameter.get(1);
			
			if(xMax > maxX && yMax > maxY) {
				return true; 
			}
			
			
		}
		else if(ShapeType.CIRCLE.equals(shapeType)) {
			
			int originX = point.getX();
			int originY = point.getY();
			
			int maxX = originX +  parameter.get(0);
			int maxY = originY + parameter.get(0);
			
			if(xMax > maxX && yMax > maxY) {
				return true; 
			}
			
		}
		else if(ShapeType.TRIANGLE.equals(shapeType)) {
			
			int originX = point.getX();
			int originY = point.getY();
			
			int x1 = parameter.get(0);
			int y1 = parameter.get(1);
			
			int x2 = parameter.get(2);
			int y2 = parameter.get(3);
			
			
			if(xMax > originX && yMax > originY && xMax > x1 && yMax > y1 && xMax > x2 && yMax > y2) {
				return true; 
			}
			
			
		}
		else if(ShapeType.REGULARPOLYGON.equals(shapeType)) {
			
		}
		
		return false; 
	
	}


	
	public void addShape(Shape shape) {
		// TODO Auto-generated method stub
		
		if(shape == null) {
			return ;
		}
		
		 if(possibleToAdd(shape)) {
			 
			 Timestamp instant = Timestamp.from(Instant.now()); 
			 areaMap.put(shape, shape.getArea());
			 perimeterMap.put(shape, shape.getPerimeter());
			 timeStampMap.put(instant , shape);
			 
			 Point origin = shape.getOrigin();
			 int originX = origin.getX();
			 int originY = origin.getY();
				
			 
			 originDistanceMap.put(shape,(int) Math.sqrt(Math.pow(originX, 2) + Math.pow(originY, 2)));
			 
			 
			 
			 listOfShape.add(shape);
		 }
		

	}

	
	public void deleteShape(Shape shape) {
		// TODO Auto-generated method stub
		
		if(shape == null) {
			return ; 
		}
		if(listOfShape.contains(shape)) {
			listOfShape.remove(shape); 
		}

	}

	
	public void deleteAllShape(ShapeType shapeType) {
		// TODO Auto-generated method stub
		
		for(Shape checkShape : listOfShape) {
			
			if(checkShape.getShapeType() == shapeType) {
				listOfShape.remove(checkShape); 
			}
		}
		

	}
	
	
	public  List<Shape> sortByValue(HashMap<Shape, Integer> hm)
    {

        
	      List<Shape> ans = new ArrayList<Shape>();
	      List<Integer> sortedValue = new ArrayList<Integer>();
	    
	        for(HashMap.Entry<Shape, Integer> entry1 : hm.entrySet()) {
	        	sortedValue.add(entry1.getValue());
	        }
	        
	        Collections.sort(sortedValue); 
	        
	        for(Integer it : sortedValue) {
	        	 for(HashMap.Entry<Shape, Integer> entry1 : hm.entrySet()) {
	             	
	             	if(entry1.getValue() == it) {
	             		ans.add(entry1.getKey()); 
	             	}
	             }
	        }
	        return ans; 
    }

	
	public List<Shape> sortedInAreaOrder() {
		// TODO Auto-generated method stub
		
        List<Shape> ans = new ArrayList<Shape>();
	     ans = sortByValue(areaMap);
		
		return ans;  
	
       
		
	}
	
	public List<Shape> sortedInPerimeterOrder(){
		
	      List<Shape> ans = new ArrayList<Shape>();
		  ans = sortByValue(perimeterMap);
			
			return ans;
	}

	
	public List<Shape> sortedInTimeStampOrder() {
		// TODO Auto-generated method stub
		
		List<Shape> ans = new ArrayList<Shape>();
		
		for(Shape value : timeStampMap.values()) {
			ans.add(value);
		}
	
       return ans; 
		
	}
	
	public List<Shape> sortedInOriginDistanceOrder() {
		// TODO Auto-generated method stub
		
		 List<Shape> ans = new ArrayList<Shape>();
		 ans = sortByValue(originDistanceMap);
			
		 return ans;
       
		
	}

	
	public List<Shape> enclosedPointShape(Point checkPoint) {
		// TODO Auto-generated method stub
		
		List<Shape> enclosedPointShape = new ArrayList<>();
		
		for(Shape shape : listOfShape) {
			
			if(shape.isPointEnclosed(checkPoint)) {
				enclosedPointShape.add(shape);
			}
		}
			
		return enclosedPointShape;
	}

}
