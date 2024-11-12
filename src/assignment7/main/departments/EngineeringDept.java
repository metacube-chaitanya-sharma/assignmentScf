package assignment7.main.departments;

import java.util.List;

import assignment7.main.Department;
import assignment7.main.Employee;

public class EngineeringDept extends Department {
    
	
	
	public EngineeringDept(String departmentName) {
		super(departmentName);
	
	}

	/**
	 * add the employee to the department
	 */
	public boolean join(Employee employee) {
		
		if(employee == null) {
			return false; 
		}
		
		if(employeeList != null) {
			employeeList.add(employee);
			return true; 
		}
       if(!employeeList.contains(employee)) {
    	   employeeList.add(employee);
    	   return true; 
		}
		
		
		return false;
	}


	/**
	 * remove the employee from the department
	 */
	public boolean relieve(Employee employee) {
		
		if(employee == null) {
			return false; 
		}
		if(employeeList.contains(employee)) {
    		employeeList.remove(employee);
    		return true; 
    		}
    		
    		return false;
	}
 
	/**
	 * return the all the employee of the department
	 */
	public List<Employee> getEmployees() {
	
		
		return employeeList;
	}

}
