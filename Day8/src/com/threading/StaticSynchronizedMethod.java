package com.threading;
class test1{
	//static synchronized is used so that it does one method completely and then enter into second method
	//due to this two threads cannot parallally enter different methods
	synchronized static public void countIncremnt() {
		System.out.println("Increment");
		for(int i=0;i<3;i++) {
			System.out.println(i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	synchronized static public void countDecrement() {

		System.out.println("Decrement");
		for(int i=3;i>0;i--) {
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
class mythread4 extends Thread{
	test1 t;
	public mythread4(test1 t) {
		// TODO Auto-generated constructor stub
		this.t=t;
	}
	@Override
	public void run() {
		t.countDecrement();
		t.countIncremnt();
	}
}
public class StaticSynchronizedMethod {
	public static void main(String[] args) {
		test1 obj=new test1();
		mythread4 t1=new mythread4(obj);
		mythread4 t2=new mythread4(obj);
		t1.start();
		t2.start();
	}
}
