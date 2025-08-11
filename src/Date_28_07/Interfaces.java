package Date_28_07;

interface display{
	String Sayhello(String name);	
	default void human() {
		System.out.println("I am human");
	}
	static void animal() {
		System.out.println("I am animal");
	}
}

public class Interfaces implements display {
	public String Sayhello(String name) {
		return "my 2nd name "+name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//before java 1.8
		display obj1 = new display() {
			public String Sayhello(String name) {
				return "my name is "+name;
			}
		};
		Interfaces obj2 = new Interfaces();
		
		System.out.println(obj1.Sayhello("mayank"));
		System.out.println(obj2.Sayhello("rahul"));
		
	}

}
