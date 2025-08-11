package LabSessions_23_07;

class Employee{
	public void work(){
	}
	public void salary() {
		
	}
}

class hrmanager extends Employee{
	public void work() {
		System.out.println("Hr is working right now.");
	}
	public void addEmployee() {
		System.out.println("Added successfully");
	}
}

public class Work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hrmanager obj=new hrmanager();
		obj.work();
		obj.addEmployee();
	}

}