package AtomicInteger;

class Counter extends Thread {
	int count = 0;
	public void run() { 
		for (int i = 0; i < 10000; i++) {
			count++;   //read ,increment and update
		}
	}
}
public class NotThreadSafe {
	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		Thread first = new Thread(c,"First");
		Thread second = new Thread(c,"Second");
		first.start();
		second.start();
		first.join();
		second.join();
		System.out.println(c.count);
	}
}