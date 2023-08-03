package com.threadCreate;

class Display{
	public synchronized void propose(String name) {
		for(int i=1;i<=2;i++)
		{
			System.out.println("Proposed By : ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
			System.out.println(name);
		}
	}
}

class MyTh extends Thread{
	Display d;
	String name;
	public MyTh(Display d, String name) {
		this.d = d;
		this.name = name;
	}
	
	@Override
	public void run() {
		d.propose(name);
	}
	
}
public class Synchronizatio {
	public static void main(String[] args) {
		Display d = new Display();
		MyTh t = new MyTh(d, "Ram");
		MyTh t1 = new MyTh(d, "Janaki");
		t.start();
		t1.start();
	}
}


