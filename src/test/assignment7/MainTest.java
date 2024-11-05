package test.assignment7;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import assignment7.main.Department;
import assignment7.main.Employee;
import assignment7.main.Organization;
import assignment7.main.departments.AdminDept;
import assignment7.main.departments.EngineeringDept;
import assignment7.main.employee.Developer;
import assignment7.main.employee.Qa;

public class MainTest {
	
	@Test
	public void main() {
		
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
	    
	    boolean exceptedResult1 = true;
	    
	    boolean actualResult1 = admin.join(emp1);
	    
		   admin.join(emp2);
		   eng.join(emp3);
		   eng.join(emp4);
		   eng.join(emp5);
	    
	    ArrayList<Employee> exceptedResult2 = new ArrayList<Employee>(Arrays.asList(emp1, emp2 , emp3, emp4, emp5));
	    ArrayList<Employee> actualResult2 = metacube.getAllEmployees();
	    
	    	    
	    
	    Assertions.assertEquals(exceptedResult1, actualResult1);
	    Assertions.assertIterableEquals(exceptedResult2, actualResult2);
	}

}
