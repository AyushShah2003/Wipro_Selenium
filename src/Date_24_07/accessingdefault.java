package Date_24_07;

//Accessing default specifier class with subclass
class access extends defaultaccess {
	public void syso() {
		// TODO Auto-generated method stub
		System.out.println("Accessing default in subclass");
	}
}
public class accessingdefault {
	
	public static void write() {
		System.out.println("currently writing");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		write();
		// Accessing default specifier class with non subclass
		defaultaccess.read();
	}

}
