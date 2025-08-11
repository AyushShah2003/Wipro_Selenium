package MultiThreadingLabs;
class PrimeThread extends Thread {
    int start, end, sum = 0;
    PrimeThread(int s, int e) { start = s; end = e; }
    public void run() {
        for (int i = start; i <= end; i++) {
            if (i > 1 && isPrime(i)) sum += i;
        }
    }
    boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0) return false;
        return true;
    }
}

public class PrimeSum {
    public static void main(String[] args) throws Exception {
        PrimeThread t1 = new PrimeThread(1, 50);
        PrimeThread t2 = new PrimeThread(51, 100);
        t1.start(); t2.start(); t1.join(); t2.join();
        System.out.println("Sum: " + (t1.sum + t2.sum));
    }
}