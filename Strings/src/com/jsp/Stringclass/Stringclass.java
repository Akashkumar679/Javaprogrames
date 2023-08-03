package com.jsp.Stringclass;

public class Stringclass {

	public static void main(String[] args) {
		String s2=new String("Mukesh behera");
		System.out.println(s2.length());
		
		String s1="mukesh Behera";// here internally create one string object//
		System.out.println(s1.length());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.toLowerCase());
	}
}
   