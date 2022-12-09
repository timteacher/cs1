package chapter8;

public class Manager extends Employee {
	private int bonus;
	
	public double getSalary() {
		return super.getSalary()+bonus;
	}	
	public String getName() {
		return "* "+super.getName();
	}
}
