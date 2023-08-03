package com.jsp.Stringclass;

public class Reversentense {

	public static void main(String[] args) {
		String s[] = "My Name is Akash".split(" ");
		String Rev= "";
		for (int i = s.length - 1; i >= 0; i--) {
			Rev += s[i] + " ";
		}
		System.out.println("Reversed String:");
		System.out.println(Rev.substring(0, Rev.length() - 1));
	}

}
