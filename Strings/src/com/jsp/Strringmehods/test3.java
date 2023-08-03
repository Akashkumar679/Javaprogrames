package com.jsp.Strringmehods;

public class test3{
	public static void main(String[] args) {
		circle c1 = new circle(100);
		circle c2 = new circle(100);
		System.out.println(c1==c2);// compare with Address
		System.out.println(c1.equals(c2));//here equals method compare with string values
	}
}