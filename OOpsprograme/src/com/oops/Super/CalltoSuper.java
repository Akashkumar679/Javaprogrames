package com.oops.Super;
class Super{
	public void m1() {
		System.out.println("m1()  for superclass");
	}
}
class child extends Super{
	public void m2() {
		super.m1();
		System.out.println("m2() for childclass");
	}
}
public class CalltoSuper {

	public static void main(String[] args) {
		new child().m2();
	}

}
