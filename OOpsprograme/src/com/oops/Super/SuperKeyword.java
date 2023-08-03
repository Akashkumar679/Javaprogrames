package com.oops.Super;
class A{
	int i=10;
	public void m1() {
		System.out.println("m1 method for A");
	}
}
class B extends A{
	public void m2() {
		System.out.println(super.i);
		System.out.println("m2 method for B");
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		new B().m2();
	}

}
