package com.jsp.Stringclass;

public class Reversword {

	public static void main(String[] args) {
		String s1 = "Samantha is beatifull";
		String[] word = s1.split("");
		String reverseword = "";
		for (int i = word.length - 1; i >= 0; i--) {
			reverseword += word[i];
			if (i >= 0)
				reverseword += "";
		}
		System.out.println(reverseword);
	}

}
