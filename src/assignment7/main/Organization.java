package assignment7.main;

import java.util.ArrayList;
import java.util.List;

public class Organization {
	
	private String organizationName;
	private ArrayList<Department> departmentList  ; 	  
	 	  

	public Organization(String organizationName) {
		super();
		this.setOrganizationName(organizationName);
		this.departmentList  = new ArrayList<Department>(); 
		
	}



    /**
     * Add the department into the organization
     * @param department
     * @return
     */
	public boolean addDepartment(Department department) {
		
		if(departmentList != null) {
			
		   departmentList.add(department);
			return true; 
		}else if(!departmentList.contains(department)) {
			
		
		    departmentList.add(department);
			return true; 
		}
		
		return false; 
		
	
		
	}
	/**
	 * return the all department from the organization
	 */
	public void  getAllDepartment(){
		
		for(Department dept : departmentList) {
			System.out.println(dept.departmentName);
		}
	}
	
	/**
	 * return the all the employee of the organization
	 * @return
	 */
	public ArrayList<Employee> getAllEmployees(){

		ArrayList<Employee> allEmployee = new ArrayList<Employee>();
		
		for(Department  it : departmentList) {
			
				allEmployee.addAll(it.employeeList);
		}
		
		return allEmployee; 
		
	}



	public String getOrganizationName() {
		return organizationName;
	}



	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	
     
}
