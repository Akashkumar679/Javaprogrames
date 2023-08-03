package com.jsp.Stringclass;

public class Stringpallindrome {
	public static boolean ispallindirme(String s) {
		int i=0,j=s.length()-1;
		s=s.toLowerCase();
		while (i<j) {
			if (s.charAt(i)!=s.charAt(j))
		return false;
		i++;
		j--;
		}
		return true;
	}
	public static void main(String[] args) {
	
		System.out.println(ispallindirme("Malayalam"));
	}
}
