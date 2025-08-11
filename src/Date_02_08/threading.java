package Date_02_08;
class count extends Thread{
	static int c = 0;
	
	public void run() {
		c++;
		System.out.println(c);
	}
}

public class threading {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new count();
		Thread t2 = new count();
		Thread t3 = new count();
		t1.start();
		t2.start();
		t3.start();
		
//		System.out.println(c);
	}

}