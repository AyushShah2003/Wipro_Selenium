package Date_02_08;

class syncthread {
	private int c = 0;
	public synchronized void inc() {
		c++;
	}
	public synchronized int get() {
		return c;
	}
}

public class ThreadSync {
	public static void main(String[] args) throws InterruptedException {
		syncthread obj = new syncthread();
		Thread t1 = new Thread (()->{
			for(int i=0;i<10000;i++) {
				obj.inc();
			}
		});
		Thread t2 = new Thread(()->{
			for(int i=0;i<10000;i++) {
				obj.inc();
			}
		});
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(obj.get());
	}

}
