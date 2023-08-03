package com.threadCreate;
class implementsrunble implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i <3; i++) {
			System.out.println("Akash");
		}
	}
	
}
public class ImplementRunble {

	public static void main(String[] args) {
	implementsrunble m= new implementsrunble();
		Thread t=new Thread(m);
		t.start();
		
		for (int i = 0; i <=3; i++) {
			System.out.println("Behera");
		}
	}

}
