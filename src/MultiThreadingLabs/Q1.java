package MultiThreadingLabs;

public class Q1  extends Thread {
      
	   public void run() {
        System.out.println("Hello, World!");
    }
	   public static void main(String[] args )
	   {
		   Thread thread = new Q1();
		   thread.start();
	   }
}


