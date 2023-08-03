package com.jsp.Stringclass;

public class Countdigit {

	public static void main(String[] args) {
		String s1="Aka234";
		for (int i = 0; i <s1.length(); i++) {
			char a=s1.charAt(i);
//			System.out.println(a);
			if (a>='0' && a<='9') {
				System.out.println(a);
			}
		}

	}

}