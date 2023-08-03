package com.jsp.Stringclass;

public class revsersWord {
	public static void main(String[] args) {
		String s1 = "Akash kumar";
		String[] a = s1.split("");
		String s2 = "";
		for (int i = a.length - 1; i >= 0; i--) {
			s2 += a[i];
			if (i > 0)
				s2 += "";
			System.out.println(s2);

		}
	}
}
