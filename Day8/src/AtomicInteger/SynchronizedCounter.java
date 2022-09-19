package AtomicInteger;

class Counter1 extends Thread {
	int count = 0;
	public synchronized void run()
	{
		int max = 10000;
		for (int i = 0; i < max; i++) {
			count++;
		}
	}
}
public class SynchronizedCounter {
	public static void main(String[] args)
		throws InterruptedException
	{
		Counter1 c = new Counter1();
		Thread first = new Thread(c, "First");
		Thread second = new Thread(c, "Second");
		first.start();
		second.start();
		first.join();
		second.join();
		System.out.println(c.count);
	}
}