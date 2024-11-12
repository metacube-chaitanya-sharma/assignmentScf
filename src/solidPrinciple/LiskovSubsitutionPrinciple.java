package solidPrinciple;

public class LiskovSubsitutionPrinciple {

	// If class B is subtype of Class A , then we should be able to 
	// replace object of A with B without breaking the behaviour of 
	// of the program
	
	// Subclass should extend the capability of parent class not narrow 
	// it down
	
//	Example : 
		
		interface Bike{
		
		void turnOnEngine();
		void accelerate();
	
	}
	
	class MotorCycle implements Bike{
		
		boolean isEngineOn; 
		int speed; 
		
		public void turnOnEngine() {
			isEngineOn = true; 
		}
		
		public void accelerate() {
			speed = speed + 10; 
		}
		
	}
	
	class Bicycle implements Bike{
		
		public void turnOnEngine() {
			
			throw new AssertionError("there is no engine");
		}
		
		public void accelerate() {
			//do something
		}
	}
	// in this example the bicycle is narrow down the capability of the Class
}
