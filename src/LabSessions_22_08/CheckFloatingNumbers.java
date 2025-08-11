package LabSessions_22_08;

import java.util.Scanner;

public class CheckFloatingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float n1 = sc.nextFloat(), n2=sc.nextFloat();
		if(Math.abs(n1-n2)<=0.009) {
			System.out.println("Same up to two decimal places");
		} else {
			System.out.println("Numbers are different");
		}
	}

}
