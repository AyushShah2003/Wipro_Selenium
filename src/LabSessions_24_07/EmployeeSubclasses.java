package LabSessions_24_07;

class perEmployee extends Employee{
	perEmployee(String name, int id) {
		super(name, id);
	}

	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		System.out.println("Permanent Employee Salary is calculated");
	}
}

class conEmployee extends Employee{
	conEmployee(String name, int id) {
		super(name, id);
	}

	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		System.out.println("Contracted Employee Salary is calculated");
	}
}

public class EmployeeSubclasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perEmployee obj1 = new perEmployee("mayank",1234);
		conEmployee obj2 = new conEmployee("rahul",53323);
		System.out.println(obj1.EmployeeName+" , "+obj1.EmployeeId);
		obj1.calculateSalary();
		System.out.println(obj2.EmployeeName+" , "+obj2.EmployeeId);
		obj2.calculateSalary();
	}

}
