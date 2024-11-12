package assignment8;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Screen  {
	
	private int xMax; 
	private int yMax;
	 
	
	List<Shape> listOfShape = new ArrayList<Shape>();
	
	HashMap<Shape , Integer> areaMap = new HashMap<Shape , Integer>();
	HashMap<Shape , Integer> perimeterMap = new HashMap<Shape , Integer>();
	HashMap<Shape , Integer> originDistanceMap = new HashMap<Shape , Integer>();
	HashMap<Shape , Timestamp> timeStampMap = new HashMap<Shape ,Timestamp>();
	
	

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
	
	public List<Shape> showShapes() {
		return listOfShape; 
	}


	public boolean possibleToAdd(Shape shape) {
		
		Point point = shape.getOrigin();
		
		ShapeType shapeType = shape.getShapeType();	
		
		List<Integer> parameter = shape.getParameters(); 
		
		
		
		if(ShapeType.SQUARE.equals(shapeType)) {
			
//			System.out.println("Square");
			int originX = point.getX();
			int originY = point.getY();
			
			int maxX = originX +  parameter.get(0);
			int maxY = originY + parameter.get(0);

			
			if(xMax >= maxX && yMax >= maxY) {
				
				return true; 
			}
		}
		else if(ShapeType.RECTANGLE.equals(shapeType)) {
//			System.out.println("Rectangle");
			int originX = point.getX();
			int originY = point.getY();
			
			int maxX = originX +  parameter.get(0);
			int maxY = originY + parameter.get(1);
			
			if(xMax >= maxX && yMax >= maxY) {
				return true; 
			}
			
			
		}
		else if(ShapeType.CIRCLE.equals(shapeType)) {
			
			int originX = point.getX();
			int originY = point.getY();
			
			int maxX = originX +  parameter.get(0);
			int maxY = originY + parameter.get(0);
			
			if(xMax >= maxX && yMax >= maxY) {
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
			
			
			if(xMax >= originX && yMax >= originY && xMax >= x1 && yMax >= y1 && xMax >= x2 && yMax >= y2) {
				return true; 
			}
			
			
		}
		else if(ShapeType.REGULARPOLYGON.equals(shapeType)) {
			
			int minimizeX = point.getX(); 
			int minimizeY = point.getY() ; 
			
			int extremeX = point.getX(); 
			int extremeY = point.getY(); 
			
			
			
			
			for(int i=0; i<parameter.size(); i += 2) {
				
				minimizeX = Math.min(minimizeX, parameter.get(i));
				minimizeY = Math.min(minimizeY, parameter.get(i+1));
	            extremeX = Math.max(extremeX, parameter.get(i));
	            extremeY = Math.max(extremeY, parameter.get(i+1));
				
			}
			
			if(minimizeX > 0 && minimizeY > 0 && xMax > extremeX && yMax > extremeY) {
				return true; 
			}
			
			
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
			 timeStampMap.put(shape, instant);
			 
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
		       
		
		int len = listOfShape.size(); 
		
		List<Shape> ans = new ArrayList<Shape>(); 
		
			for(int index =0; index<len; index++) {
				
				if(listOfShape.get(index).getShapeType() != shapeType) {
					
					ans.add(listOfShape.get(index));
				}
			}
			
			listOfShape = ans; 
			ans.clear();
			
			

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
	
	public  List<Shape> sortByValueForTimeStamp(HashMap<Shape, Timestamp> hm)
    {

        
	      List<Shape> ans = new ArrayList<Shape>();
	      List<Timestamp> sortedValue = new ArrayList<Timestamp>();
	    
	        for(HashMap.Entry<Shape, Timestamp> entry1 : hm.entrySet()) {
	        	sortedValue.add(entry1.getValue());
	        }
	        
	        Collections.sort(sortedValue); 
	        
	        for(Timestamp it : sortedValue) {
	        	 for(HashMap.Entry<Shape, Timestamp> entry1 : hm.entrySet()) {
	             	
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
		ans = sortByValueForTimeStamp(timeStampMap);
	
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
