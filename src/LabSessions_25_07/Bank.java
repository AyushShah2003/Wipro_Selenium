package LabSessions_25_07;

class SavingsAccount implements Accounts{
	private double balance;
	private double Irate = 0.04;
	SavingsAccount(double initialAmount){
		this.balance = initialAmount;
	}
	@Override
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposit successfully! Current balance :"+balance);
	}

	@Override
	public void withdraw(double amount) {
		balance -= amount;
		System.out.println("Withdraw successfully! Current balance :"+balance);
	}

	@Override
	public void calculateInterest() {
		double interest = balance*Irate;
		System.out.println("Interest rate amount : "+interest);
	}

	@Override
	public void viewBalances() {
		System.out.println("Current balance is :"+balance);
	}	
}

class CurrentAccount implements Accounts{
	private double balance;
	private double Irate = 0.07;
	CurrentAccount(double initialAmount){
		this.balance = initialAmount;
	}
	@Override
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposit successfully! Current balance :"+balance);
	}

	@Override
	public void withdraw(double amount) {
		balance -= amount;
		System.out.println("Withdraw successfully! Current balance :"+balance);
	}

	@Override
	public void calculateInterest() {
		double interest = balance*Irate;
		System.out.println("Interest rate amount : "+interest);
	}

	@Override
	public void viewBalances() {
		System.out.println("Current balance is :"+balance);
	}		
}

public class Bank {
	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount(40000);
		CurrentAccount ca = new CurrentAccount(200000);
		sa.viewBalances();
		ca.viewBalances();
	}

}
