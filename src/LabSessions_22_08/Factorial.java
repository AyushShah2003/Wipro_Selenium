package LabSessions_22_08;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5, fact=1;
		while(n>0) {
			fact*=n;
			n--;
		}
		System.out.println(fact);
	}

}