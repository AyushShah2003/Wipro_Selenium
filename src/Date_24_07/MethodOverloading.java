package Date_24_07;

public class MethodOverloading {
	
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	public static float sum(float a,int b) {
		return (float)a+b;
	}
	
	public static float sum(int a,float b) {
		return (float)a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(2,3));
		System.out.println(sum(2,3,5));
		System.out.println(sum(2.56f,3));
		System.out.println(sum(2.43f,3));
		System.out.println(sum(2,3.34f));
	}

}