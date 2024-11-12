package solidPrinciple;

public class DependencyInversionPrinciple {

	
	// class should depend on interfaces rather than concrete classes
	
	
	// Example ; 
	
//	class MacBook{
//		
//		private final WiredKeyboard keyboard; 
//		private final WiredMouse mouse; 
//		
//		public MacBook() {
//			keyboard = new WiredKeyboard();
//			mouse = new WiredMouse();
//		}
//	}
	
	// In this example the concrete class object is assigned in constructor
	// their is no scope of change
	// Now to solve this 
	
//	Solution : 
		/*
		class MacBook{
		
		private final Keyboard keyboard; 
		private final Mouse mouse; 
		
		public MacBook(Keyboard keyboard , Mouse mouse) {
			this.keyboard = keyboard; 
			this.mouse = mouse; 
		}
	}
	
	// it capacable of any object to take it 
	*/
	
	
	
	
	
	
	
}
