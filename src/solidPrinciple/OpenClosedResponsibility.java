package solidPrinciple;

public class OpenClosedResponsibility {

	
	// Open for Extension but Closed for Modification
//	   -> you can extend the class but do not modification the class which is working fine 
	
//	example :

	/*
	class InvoiceDao{
		
		Invoice invoice; 
		
		public InvoiceDao(Invoice invoice) {
			this.invoice = invoice; 
		}
		
		public void saveToDB() {
			// save Invoice into DB
		}
	}
	*/
	
	// Suppose now you have to save this into file also
	// so you have to extend the class or make Interface
	
	
//	Solution : 
	
	/*
	interface InvoiceDao{
		
		public void save(Invoice invoice);
	}
	
	class DatabaseInvoiceDao implements InvoiceDao{
		
		public void save(Invoice invoice) {
			// save to DB
		}
		
	}
	
	class FileInvoiceDao implements InvoiceDao{
		
		public void save(Invoice invoice) {
			// save to file
		}
	}
	*/
	
	
	
	
	
}
