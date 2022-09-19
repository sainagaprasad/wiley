package com.threading;

public class ClientTest {

	public static void main(String[] args) {
		Counter counter = new Counter();

		new Thread() {
			public void run() {
				for (int i = 1; i <= 20000; i++) {
					counter.increment();
				}
			}
		}.start();

		new Thread() {
			public void run() {
				for (int i = 1; i <= 80000; i++) {
					counter.increment();
				}
			}
		}.start();

		System.out.println("Final counter Value:" + counter.getValue());
	}
}