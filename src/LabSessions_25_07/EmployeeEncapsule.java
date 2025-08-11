package LabSessions_25_07;
class Employee{
	private String name;
	private int id;
	private double salary;
	Employee(String name){
		this.name = name;
	}
	
	public void displayDetails() {
		System.out.println("I am "+name+", my id is "+id+" and my salary is "+salary);
	}
	
	public void setSalary(double salary) {
		if(salary<0) System.out.println("Salary must be positive");
		else this.salary = salary;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public int getId() {
		return id;
	}
	
	public String name() {
		return name;
	}
}

public class EmployeeEncapsule {
	public static void main(String[] args) {
		Employee obj = new Employee("Mayank");
		obj.setSalary(50000);
		obj.setId(123);
		obj.displayDetails();
	}
}
