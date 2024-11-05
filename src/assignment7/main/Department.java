package assignment7.main;

import java.util.ArrayList;
import java.util.List;

public  abstract class Department extends Organization {
	
	public String departmentName;
	public  ArrayList<Employee> employeeList;
	
	public Department(String departmentName) {
		super(departmentName);
		this.departmentName = departmentName; 
		employeeList = new ArrayList<Employee>();
		 
	}
	
	public abstract boolean join(Employee employee); 
    public abstract boolean relieve(Employee employee); 
	public abstract List<Employee> getEmployees(); 

	
	
}
