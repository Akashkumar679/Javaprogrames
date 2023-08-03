package com.java.practis;

class A {
	public void m1(char c, int a) {
		System.out.println("Akash");
	}
}

class B extends A {
	public void m1(float a, double d) {
		System.out.println("child");
	}
}

public class Overrloading {

	public static void main(String[] args) {
		B b = new B();
		b.m1('A', 8.2);
	}

}
