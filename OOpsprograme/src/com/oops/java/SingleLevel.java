package com.oops.java;
class color{
	public void m1() {
		System.out.println("m1 method for color");
	}
}
class red extends color{
	public void m2() {
		System.out.println("m2 method for red");
	}
}
public class SingleLevel {

	public static void main(String[] args) {
		red r = new red();
		r.m1();
		r.m2();
	}

}
