package Date_25_07;

public class Interface1Childs implements Interface1{
	//interface1 and 2 have same method
	@Override
	public void display() {
		System.out.println("Interface 1 and 2 have same abstract methods");
	}
	//interface 1
	@Override
	public void write() {
		System.out.println("Interface 1 is Writing");
	}
	//interface2
	@Override
	public void read() {
		System.out.println("Interface 2 is reading");
	}
	
	public static void main(String[] args) {
		Interface1Childs obj = new Interface1Childs();
		obj.display();
		obj.write();
		obj.read();
//		Interface1.stk();
//		obj.def();	
		System.out.println(name);
		System.out.println(id);
	}
}