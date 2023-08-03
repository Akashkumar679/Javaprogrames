package com.jsp.Stringclass;

public class ReverseWordEachdigit {

	public static void main(String[] args) {
		String s1 = "smantha is beautiful";
		String[] s2 = s1.split(" ");
		String reverse = "";
		for (int i = 0; i < s2.length; i++) {
			String word = s2[i];
			String rev = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				rev = rev + word.charAt(j);
			}
			reverse = reverse + rev + " ";
		}
		System.out.println(s1);
		System.out.println(reverse);
	}

}
