package com.threadCreate;

public class Priority extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <=4; i++)
			System.out.println("child class");
	}
	
}
class test1{
	public static void main(String[] args) {
		Priority d = new Priority();
		d.start();
		d.setPriority(9);
		System.out.println(d.getPriority());
		Thread.currentThread().setPriority(6);
		System.out.println(Thread.currentThread().getPriority());
		for (int i = 1; i <=4; i++) {
			System.out.println("main");
		}
	}

}
