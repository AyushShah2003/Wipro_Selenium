package LabSessions_24_07;



public class Customers {
	
	protected static String customerName = "Customer";
	protected static int customerId = 22432;
	protected static String customerDepartment = "Food";
	
	protected static void displayCustomerData() {
		System.out.println(customerName+"\n"+customerId+"\n"+customerDepartment);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayCustomerData();
	}

}