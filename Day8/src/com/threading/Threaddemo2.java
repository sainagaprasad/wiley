package com.threading;

public class Threaddemo2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run invoked");
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		Threaddemo2 demo2=new Threaddemo2();
		//demo2.start doesnot work as start is not present in runnable interface
		Thread t1=new Thread(demo2);
		t1.start();
		demo2.run();
	}

}
