package assignment7.main.departments;

import java.util.List;

import assignment7.main.Department;
import assignment7.main.Employee;
import assignment7.main.Organization;
import assignment7.main.employee.Developer;

public class AdminDept extends Department{

    
	public AdminDept(String departmentName) {
		super(departmentName);
		// TODO Auto-generated constructor stub
	}

	/**
	 * add the employee to the department
	 */
	public boolean join(Employee employee) {
		// TODO Auto-generated method stud
		
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
		// TODO Auto-generated method stub
		
		return employeeList;
	}

	
}
