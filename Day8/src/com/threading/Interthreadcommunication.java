package com.threading;
class printer{
	int pa=100;
	synchronized void printpages(int i) {
		// TODO Auto-generated method stub
		System.out.println("printing the pages");
		for(int i1=0;i1<100;i1++) {
			pa--;
			System.out.println("current page "+pa);
		}
	}
	
}
public class Interthreadcommunication {
	public static void main(String[] args) {
		printer p=new printer();
		new Thread() {
			@Override
			public void run() {
				p.printpages(120);
			}
		}.start();
	}
}
