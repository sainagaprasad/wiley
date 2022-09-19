package AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;
class Counter2 extends Thread {
	AtomicInteger count;
	Counter2()
	{
		count = new AtomicInteger();
	}
	public void run()	//non- blocking , CAS Compare at memory location ,update and swap
	{
		int max = 10000;
		for (int i = 0; i < max; i++) {
			count.addAndGet(1);  //addAndGet method in AtomicInteger Class
		}
	}
}
public class UsingAtomicVariable {
	public static void main(String[] args)
		throws InterruptedException
	{
		Counter2 c = new Counter2();
		Thread first = new Thread(c, "First");
		Thread second = new Thread(c, "Second");
		first.start();
		second.start();
		first.join();
		second.join();
		System.out.println(c.count);
	}
}