package com.jsp.Stringclass;

public class Repalce {

	public static void main(String[] args) {
		String a = "Akashk@527com";
		System.out.println(a.replace("@", "u"));
		String b=a.replace("@", "");
		int n=a.length()-b.length();
		System.out.println(n);
	}

}
