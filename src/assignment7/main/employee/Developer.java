package assignment7.main.employee;


import assignment7.main.Employee;

public class Developer extends Employee {
	

	
	private int salary; 
	private int bonus; 
	private int compensation; 




	public Developer(String employeeName,  int salary, int bonus, int compensation) {
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
	
	@Override
	public String toString() {
		return "Developer [salary=" + salary + ", bonus=" + bonus + ", compensation=" + compensation + "]";
	}




}
