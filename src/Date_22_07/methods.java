package Date_22_07;
public class methods {
	String empname = "mayank";
	static int empid = 123;
	public void getItems() {
		System.out.println(empname+"\n"+empid);
	}
	
	public static class class1{
		public void add(int a,int b) {
		System.out.println(a+b);
		}
		public void sub(int a,int b) {
			System.out.println(a-b);
		}
	}
	
	public static class class2{
		public void div(int a,int b) {
		System.out.println(a/b);
		}
		public void mul(int a,int b) {
			System.out.println(a*b);
		}
	}
	public void addlocal() {
		int a=4, b=5;
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		methods obj = new methods();
		//obj.getItems();
//		class1 obj1=new class1();
//		class2 obj2=new class2();
//		obj1.add(1,2);
//		obj1.sub(54,4);
//		obj2.div(12,6);
//		obj2.mul(3,5);
//		System.out.println(empid);
//		obj.addlocal();
		hlloworld o=new hlloworld();
		System.out.println(o.greet);
	}

}