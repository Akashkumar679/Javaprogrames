package com.oops.java;
class Student{
	public void name() {
		System.out.println("Akash");
	}
}
class institue extends Student{
	public void college() {
		System.out.println("Roland");
	}
}
class place extends Student{
	public void Area() {
		System.out.println("Golantara");
	}
}
public class Hirchical {

	public static void main(String[] args) {
		place p = new place();
		p.name();
		p.Area();
		institue i = new institue();
		i.college();
		i.name();
	}

}
