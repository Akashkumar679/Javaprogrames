package com.threadCreate;

class MyRunble extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <=3; i++) {
			System.out.println("child class");
		}
	}
}

public class CretaeThread {

	public static void main(String[] args) {
		MyRunble m1 = new MyRunble();
		Thread t=new Thread(m1);
		m1.start();
		System.out.println(Thread.currentThread());
		for (int i = 1; i <=2; i++) {
			System.out.println("Parent class");
		}
	}

}
