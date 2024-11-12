package assignment7.main;

import java.util.ArrayList;

import assignment7.main.departments.AdminDept;
import assignment7.main.departments.EngineeringDept;
import assignment7.main.employee.Developer;
import assignment7.main.employee.Qa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        Organization metacube = new Organization("Metacube");
		
		Department admin = new AdminDept("Admin Department");
		Department eng = new EngineeringDept("Engineering Department");
		
		
		metacube.addDepartment(admin);
		metacube.addDepartment(eng);
		
	    Employee  emp1 = new Developer("chaitanya" , 200000, 300000, 40000);
	    Employee  emp2 = new Qa("vivek" , 300000, 300000, 40000);
	    Employee  emp3 = new Developer("vinay" ,  400000, 300000, 40000);
	    Employee  emp4 = new Developer("aditya" ,  700000, 300000, 40000);
	    Employee  emp5 = new Developer("bhavya" ,  600000, 300000, 40000);
	    
	    
	   admin.join(emp1);
	   admin.join(emp2);
	   
	   eng.join(emp3);
	   eng.join(emp4);
	   eng.join(emp5);
	   
	   eng.relieve(emp5); 
	   
	    
	    
	    
	  
//	   System.out.println(emp1.getBasicSalary());
	    
	    
//	    metacube.dispatchSalary(); 
	   ArrayList<Employee> employeeList = metacube.getAllEmployees();	
	   
	   for(Employee emp : employeeList) {
		   System.out.println(emp.name);
	   }
	   
//	   metacube.getAllDepartment();
	   
//	   Payroll pay = new Payroll(metacube);
//	   pay.dispatchSalary();
//	   pay.printPayslips();
	   
	
		
	}

}
