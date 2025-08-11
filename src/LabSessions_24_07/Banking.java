package LabSessions_24_07;

import Day2407.protectedclass;

class Payment{
	public void pay() {
		System.out.println("Payment Done");
	}
}
class creditCard extends Payment{
	public void pay() {
		System.out.println("Payment Done using Credit Card");
	}
}

class upi extends Payment{
	public void pay() {
		System.out.println("Payment Done using UPI");
	}
}

class netBanking extends Payment{
	public void pay() {
		System.out.println("Payment Done using NetBanking");
	}
}


public class Banking{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment obj1=new Payment();
		obj1.pay();
		obj1=new upi();
		obj1.pay();
		obj1.pay();
//		protectedclass.display();   // not visible due to protected

	}

}