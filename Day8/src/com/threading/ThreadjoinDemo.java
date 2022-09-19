package com.threading;

public class ThreadjoinDemo {
	public static void main(String[] args) {
		Thread th1=new Thread() {
			public void run() {
				System.out.println("run is invoked");
			}
		};
		th1.start();
		Runnable th2=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("run method from runnnable invoked");
			}
		};
		Thread t1=new Thread(th2);
		t1.start();
	}
}
