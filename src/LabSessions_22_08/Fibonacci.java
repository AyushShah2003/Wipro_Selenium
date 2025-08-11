package LabSessions_22_08;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int pre=0, cur=1;
		System.out.print(pre+" ");
		for(int i=1;i<=n;i++){
			System.out.print(cur+" ");
			int t=cur;
			cur+=pre;
			pre=t;
		}
		sc.close();
	}

}