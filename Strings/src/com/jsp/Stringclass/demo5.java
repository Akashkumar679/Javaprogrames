package com.jsp.Stringclass;

public class demo5 {

	public static void main(String[] args) {
		String s1 = "Akash526";
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (c >= '0' && c <= '9') 
			System.out.println(c);
			
		}
	}

}
