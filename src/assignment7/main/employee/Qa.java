package assignment7.main.employee;


import assignment7.main.Employee;

public class Qa extends Employee {

	public int salary; 
	public int bonus; 
	public int compensation; 


	public Qa(String employeeName,  int salary, int bonus, int compensation) {
		super(employeeName );
		this.salary = salary;
		this.bonus = bonus;
		this.compensation = compensation;
	}
	
    /**
     * return the salary
     */
	public int  getBasicSalary() {
		// TODO Auto-generated method stub
		return salary; 
	}
	
	/**
	 * return the bonus
	 */
	public int getBonus() {
		// TODO Auto-generated method stub
		return bonus; 
	}
	
	
    /**
     * return compensation
     */
	public int getCompensation() {
		// TODO Auto-generated method stub
		
		return compensation; 
	}

}
