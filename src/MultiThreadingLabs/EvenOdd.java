package MultiThreadingLabs;
import java.util.Scanner;
class Odd extends Thread {
    int limit;
    Odd(int limit) {
        this.limit = limit;
    }
    public void run() {
        for (int i = 1; i <= limit; i++)
            if (i % 2 != 0)
                System.out.println("Odd: " + i);
    }
}
class Even extends Thread {
    int limit;
    Even(int limit) {
        this.limit = limit;
    }
    public void run() {
        for (int i = 1; i <= limit; i++)
            if (i % 2 == 0)
                System.out.println("Even: " + i);
    }
}


public class EvenOdd {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int limit = sc.nextInt();
        sc.close();
        Odd odd = new Odd(limit);
        Even even = new Even(limit);
        odd.start();
        even.start();
    }

	}


