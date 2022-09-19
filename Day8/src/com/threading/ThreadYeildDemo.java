package com.threading;
class Threadone extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			Thread.yield();
			System.out.println("Thread one is running");
		}
	}
}
class Threadtwo extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thread two is running");
		}
	}
}
public class ThreadYeildDemo {
	public static void main(String[] args) {
		Threadone threadone=new Threadone();
		Threadtwo threadtwo=new Threadtwo();
		threadone.start();
		threadtwo.start();
	}
}
