package Project;

import java.util.Scanner;

public class ATMBank {
	private double balance;	
	private Scanner scan;
	
	public ATMBank() {
		scan = new Scanner(System.in);
		balance=1000;
	}
	
	public void displayMenu() {
		System.out.println("ATM Menu ->");
		System.out.println("1. Check Balance.");
		System.out.println("2. Diposit Balance.");
		System.out.println("3. Withdraw Balance.");
		System.out.println("4. Exit...");
	}
	
	public void checkBalance() {
		System.out.println("Your Current Balance is : "+balance);
	}
	
	public void deposit() {
		System.out.print("Enter your deposit amount : ");
		int deposit = scan.nextInt();
		if(deposit>=500) {
			balance += deposit;
			System.out.println("Deposit Successfully!");
		} else {
			System.out.println("Minimum Deposit Amount Should be 500");
		}
	}
	
	public void withdraw() {
		System.out.print("Enter your Withdrawal Amount : ");
		int withdraw = scan.nextInt();
		if(withdraw>=500 && (balance-withdraw)>=500) {
			balance -= withdraw;
			System.out.println("Withdraw Successfully!");
		} else if(withdraw<500) {
			System.out.println("Minimum Withdraw Amount should be 500");
		} else {
			System.out.println("Your balance is low!");
		}
	}
	
	public static void main(String[] args) {
		ATMBank atm = new ATMBank();
		
		while(true) {
			atm.displayMenu();
			System.out.print("Enter your choice : ");
			int choice = atm.scan.nextInt();
			switch(choice) {
				case 1:
					atm.checkBalance();
					break;
				case 2:
					atm.deposit();
					break;
				case 3:
					atm.withdraw();
					break;
				case 4:
					System.out.println("Thank you for using ATM, Good Bye!");
					return;
				default:
					System.out.println("Invalid choice, please choose valid option");
			}
		}

	}

}
