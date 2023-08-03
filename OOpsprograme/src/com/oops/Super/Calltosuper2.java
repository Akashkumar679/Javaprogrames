package com.oops.Super;
class car{
	public void engine() {
		System.out.println("perent class");
	}
	public car(int i) {
		System.out.println("call to super");
	}
}
class audi extends car{
	public audi() {
		super(12);
		System.out.println("child class");
	}
}
public class Calltosuper2 {

	public static void main(String[] args) {
	audi a=new audi();
	a.engine();
	}

}
