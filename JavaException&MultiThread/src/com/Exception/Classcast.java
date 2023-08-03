package com.Exception;

class A {

}

class B extends A {
	public void m2() {
		System.out.println("m2() method for class B");
	}
}

public class Classcast {
	public static void main(String[] args) {
		
		/*
		 * B a = (B) new A(); a.m2();
		 */
		try {
			B a=(B) new A();
			a.m2();
		} catch (ClassCastException e) {
			System.out.println("Create Upcasting");
		}
	}

}

