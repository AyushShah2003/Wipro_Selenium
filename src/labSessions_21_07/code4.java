package labSessions_21_07;

import java.util.Arrays;

public class code4 {
	// Three programs
	public static void check(int n) {
		if(n%2==0) System.out.println(n+" is Even");
		else System.out.println(n+" is Odd");
	}
	public static void divisible(int n) {
		if(n%5==0 && n%11==0) System.out.println("Yes "+n+" Divisible by both 5 and 11");
		else System.out.println(n+" is Not divisible by both");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2, b=3;
		//Swap
		System.out.println("Before Swap-> a :"+a+" , b:"+b);
		int t = a;
		a = b;
		b = t;
		System.out.println("After Swap-> a :"+a+" , b:"+b);
		//Even odd
		System.out.println("Checking even odd");
		check(a);
		check(b);
		//check divisiblity by  11 and 5
		divisible(55);
		divisible(54);
	}

}
