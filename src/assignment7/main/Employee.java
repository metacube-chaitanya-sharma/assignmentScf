package assignment7.main;

import java.util.List;

public abstract  class Employee {
	
	public String Name; 
	
	
	

	public Employee(String Name) {
		super();
		this.Name = Name;

	}

	public abstract int  getBasicSalary();
	public abstract int getBonus();
	public abstract int getCompensation(); 
	
	
	

}
