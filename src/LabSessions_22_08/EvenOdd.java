package LabSessions_22_08;

public class EvenOdd {
	
	public static boolean Even(int num) {
		if(num%2==0) return true;
		else return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12;
		if(Even(n)) System.out.println(n+" is Even.");
		else System.out.println(n+" is Odd");
	}

}
