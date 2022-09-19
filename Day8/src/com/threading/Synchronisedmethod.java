package com.threading;
class test{
	public synchronized void count() { //at a time not more than one method can enter the method
		for(int i=0;i<3;i++) {
			System.out.println(Thread.currentThread().getName());
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
class mythread extends Thread{
	test t;
	public mythread(test t) {
		// TODO Auto-generated constructor stub
		this.t=t;
	}
	@Override
	public void run() {
		t.count();
	}
}

public class Synchronisedmethod {
	public static void main(String[] args) {
		test obj=new test();
		mythread t1=new mythread(obj);
		mythread t2=new mythread(obj);
		t1.start();
		t2.start();
	}
}
