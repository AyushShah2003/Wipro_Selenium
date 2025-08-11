package LabSessions_24_07;

class SavingsAccount extends Bank{
	@Override
	void calculateInterest(double a) {
		// TODO Auto-generated method stub
		double interest = 4*a/100;
		System.out.println("The interest calculated for Savings Account is :"+interest);
	}
}

class FDAccount extends Bank{
	@Override
	void calculateInterest(double a) {
		// TODO Auto-generated method stub
		double interest = (6.5)*a/100;
		System.out.println("The interest calculated for Fixed Deposit Account is :"+interest);
	}
	
}

public class bankSubclasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount obj1 = new SavingsAccount();
		FDAccount obj2 = new FDAccount();
		obj1.calculateInterest(obj1.balance);
		obj2.calculateInterest(obj2.balance);
	}

}
