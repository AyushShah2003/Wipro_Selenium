package LabSessions_24_07;

public class College {
	// Can be access withing the class college only
	private static String name = "Mayank";
	private static int StudentId = 1234;
	private static String department = "Computer Science";
	
	private static void display() {
		System.out.println(name+"\n"+StudentId+"\n"+department);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display();
		System.out.println("Companys data");
//		Company.display();
	}

}