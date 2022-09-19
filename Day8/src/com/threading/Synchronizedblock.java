package com.threading;
//static synchronized is used so that it does one method completely and then enter into second method
	//due to this two threads cannot parallally enter different methods
class test2{
	
	//synchronized block
	public void countIncremnt() {
		System.out.println(Thread.currentThread().getName());
		synchronized (this) {
			System.out.println("Increment");
			for (int i = 0; i < 3; i++) {
				System.out.println(i);
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
class mythread5 extends Thread{
	test2 t;
	public mythread5(test2 t) {
		// TODO Auto-generated constructor stub
		this.t=t;
	}
	@Override
	public void run() {
		t.countIncremnt();
	}
}
public class Synchronizedblock {
	public static void main(String[] args) {
		test2 obj=new test2();
		mythread5 t1=new mythread5(obj);
		mythread5 t2=new mythread5(obj);
		t1.start();
		t2.start();
	}
}
