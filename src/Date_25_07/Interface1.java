package Date_25_07;


public interface Interface1 extends Interface2{
	//not override in subclasses
	static void stk() {
		System.out.println("writing in static method");
	}
	
	default void def() {
		System.out.println("default method in interface");
	}
	void display();  // by default abstract
	abstract void write();
	static String name = "Mayank";
	static final int id = 234;
}