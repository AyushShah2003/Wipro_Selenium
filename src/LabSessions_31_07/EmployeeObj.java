package LabSessions_31_07;

public class EmployeeObj implements Comparable<EmployeeObj>{
	String name; 
	int salary, productPrice;
	EmployeeObj(String name, int salary, int price){
		this.name = name;
		this.salary = salary;
		this.productPrice = price;
	}
	@Override
	public int compareTo(EmployeeObj o) {
//		return o.salary - this.salary; // salary descending order
		if(this.productPrice == o.productPrice) return this.name.compareTo(o.name);
		else return this.productPrice - o.productPrice;
	}
	
	public String toString() {
		return "("+this.name+", "+salary+", "+this.productPrice+")";
	}
}
