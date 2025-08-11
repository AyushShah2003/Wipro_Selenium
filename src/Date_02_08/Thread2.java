package Date_02_08;


class Cooking extends Thread{
	private String string;
	Cooking(String str){
		this.string = str;
	}
	
	public void run() {
		System.out.println("Your "+string+" is ready.");
	}
}

public class Thread2 {

	public static void main(String[] args) {
		Thread t1 = new Cooking("Pasta");
		Thread t2 = new Cooking("Maggi");
		Thread t3 = new Cooking("Fruit-Chat");
		Thread t4 = new Cooking("Mix Juice");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}