package assignment7.main;

import java.util.ArrayList;

public class Payroll  {

	private Organization organization; 
	


	public Payroll(Organization organization) {
		super();
		this.organization = organization;
	}

    /**
     * return the dispatch Salary after paying the  30% tax
     */
	public void dispatchSalary() {
	
		 ArrayList<Employee> allEmployee = new ArrayList<Employee>();
		 allEmployee =  organization.getAllEmployees(); 
		 for(Employee it : allEmployee) {
			
			System.out.println(it.name + " " + (it.getBasicSalary() - (it.getBasicSalary() * 30) / 100) );
		}
	
	
	}
	
    /**
     * print the all employee with their salary , bonus , compensation
     */
	public void printPayslips() {
		
		ArrayList<Employee> allEmployee = new ArrayList<Employee>();
		allEmployee =  organization.getAllEmployees(); 
		
	    for(Employee it : allEmployee) {
			System.out.println("Name:" +  " " + it.name 
					+" ,Salary:" + " "  + it.getBasicSalary()
					+ " ,Bonus:" + " "  + it.getBonus()
					+ " ,Compensation:" + " " + it.getCompensation());
		}
		
	}
		

}
