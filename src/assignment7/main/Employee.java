package assignment7.main;

import java.util.List;

public abstract  class Employee {
	
	public String name; 
	
	public Employee(String name) {
		super();
		this.name = name;

	}

	public abstract int  getBasicSalary();
	public abstract int getBonus();
	public abstract int getCompensation(); 
	
	
	

}
