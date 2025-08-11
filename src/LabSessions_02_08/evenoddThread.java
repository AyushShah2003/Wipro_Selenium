package LabSessions_02_08;

class evenOdd extends Thread{
	int i;
	evenOdd(int i){
		this.i = i;
	}
	public void run() {
		for(int j=0;j<5;j++) {
			System.out.print(i+",");
			i+=2;
		}
	}
}
class odd extends Thread{
	int l;
	odd(int lim){
		this.l = lim;
	}
	public void run() {
		int num = 1;
		for(int i=0;i<l;i++) {
			System.out.print(num+",");
			num++;
		}
	}
}

class print extends Thread{
	public void run(){
		System.out.println("Hello World!");
	}
}
public class evenoddThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t0 = new print();
		Thread t1 = new evenOdd(1);
		Thread t2 = new odd(5);
		t0.start();
		t1.start();
		t2.start();
	}
	
}