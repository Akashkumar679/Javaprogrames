package com.oops.java;

public class Car {
	public void m1() {
		System.out.println("m1 method in car");
	}
}
class vechile extends Car{
	public void m1() {
		System.out.println("m1 method in vechile");
	}
}
 class test1{
	public static void main(String[] args) {
             vechile v = new vechile();
             v.m1();
	}
}
