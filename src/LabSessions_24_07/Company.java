package LabSessions_24_07;

public class Company {
	// can be access within the class, same package and different package
	public static String employeName = "Mayank";
	public static int employeId = 234;
	public static String employeDepartment = "IT Sector";
	
	public static void displayCompanyData() {
		System.out.println(employeName+"\n"+employeId+"\n"+employeDepartment);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayCompanyData();
	}

}