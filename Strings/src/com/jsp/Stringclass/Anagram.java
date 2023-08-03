package com.jsp.Stringclass;

public class Anagram {
	static boolean anagram(String s1, String s2) {
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		while (true) {
			if (s1.length() != s2.length())
				return false;
			char c = s1.charAt(0);
			s1 = s1.replace(c + "", "");
			s2 = s2.replace(c + "", "");
			if (s1.length() == 0 && s2.length() == 0)
				return true;
		}
	}

	public static void main(String[] args) {
		System.out.println(anagram("silent", "listen"));
	}

}
