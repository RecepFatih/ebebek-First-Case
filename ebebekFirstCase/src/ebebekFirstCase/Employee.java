package ebebekFirstCase;

public class Employee {
	
	private String name;
	private double salary;
	private double workHours;
	private int hireYear;
	
	public Employee(String name, double salary, double workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	public double tax() {
		if(this.salary > 1000) {
			return (this.salary * 3.00) / 100;
		}
		else {
			return 0.00;
		}
	}
	
	public double bonus() {
		if(this.workHours > 40) {
			return (this.workHours - 40) * 30;
		}
		else {
			return 0.00;
		}
	}
	
	public double raiseSalary() {
		int totalYearsOfWork = 2021 - this.hireYear; 
		if(totalYearsOfWork < 10) {
			return (this.salary * 5) / 100;
		}
		else if(totalYearsOfWork >= 10 && totalYearsOfWork < 20) {
			return (this.salary * 10) / 100;
		}else {
			return (this.salary * 15) / 100;
		}
	}
	
	
	public String toString() {
		return "Worker: " + this.name + "\n"+
				   "Salary: " + this.salary + "\n" + 
				   "Weekly Working Hours: " + this.workHours + "\n" +
				   "Hire Year: " + this.hireYear + "\n" + 
				   "Tax: " + tax() + "\n" +
				   "Bonus: " + bonus() + "\n" +
				   "Raise Salary: " + raiseSalary() + "\n" +
				   "Salary with Taxes and Bonuses: " + (this.salary+bonus()-tax()) +  "\n" +
				   "Total Salary: " + (this.salary + bonus() + raiseSalary() - tax());
		
	}
	
	

}
