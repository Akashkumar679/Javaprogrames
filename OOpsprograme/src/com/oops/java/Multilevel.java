package com.oops.java;
class vechilefactory{
	public void carwash() {
		System.out.println("use to Water");
	}
}
class twowhiler extends vechilefactory{
	public void engineOil() {
		System.out.println("Cestrol");
	}
}
class Ktm extends twowhiler{
	public void service() {
		System.out.println("Service Center");
	}
}
public class Multilevel {

	public static void main(String[] args) {
		Ktm b = new Ktm();
		b.carwash();
		b.engineOil();
		b.service();
	}

}
