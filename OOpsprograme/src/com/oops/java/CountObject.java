package com.oops.java;

class A {
	static int i;

	public A() {
		i++;
	}
}

public class CountObject {

	public static void main(String[] args) {
		new A();
		new A();
		System.out.println(A.i);
	}

}
