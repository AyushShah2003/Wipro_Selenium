package labSessions_21_07;

public class code3 {
	
	public void greet(String name) {
		System.out.println("Welcome, "+name+"!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		code3 obj = new code3();
		obj.greet("syush");
		
		//Maximum between three no.
		int a=2, b=7, c=12;
		int d=Math.max(a,Math.max(b,c));
		System.out.println("Maximum between "+a+","+b+","+c+" is : "+d);
	}

}