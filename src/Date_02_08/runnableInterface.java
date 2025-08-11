package Date_02_08;

class runInter implements Runnable{
	int id;
	runInter(int id){
		this.id = id;
	}
	@Override
	public void run() {
		System.out.println("Thread is running"+id);
//		System.out.println("Running "+Thread.currentThread().getName());
	}
}

public class runnableInterface{
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			Thread t1 = new Thread(new runInter(i));
			t1.start();
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}	
		System.out.println("This is final");
	}
}
