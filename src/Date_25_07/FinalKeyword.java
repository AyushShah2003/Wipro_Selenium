package Date_25_07;

final class Car{
	void display() {
		System.out.println("Car is there");
	}
}

class bike{
	final void display() {
		System.out.println("This is bike");
	}
}

public class FinalKeyword extends bike{
	//can'nt override the method 	
//	void display() {
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int id = 123;
//		id = 345; // we can'n change it
		Car obj1 = new Car();
		bike obj2 = new bike();
		obj1.display();
		obj2.display();
	}

}