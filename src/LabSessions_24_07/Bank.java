package LabSessions_24_07;


abstract class Bank {
	public final int accountNumber = 283499408;
	public int balance = 500000;
	
	abstract void calculateInterest(double a);
	public void printbalance() {
		System.out.println("The Current Balance is :"+balance);
	};
}