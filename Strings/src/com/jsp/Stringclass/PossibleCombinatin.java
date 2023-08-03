package com.jsp.Stringclass;

public class PossibleCombinatin {
	static String swap(String s, int i, int j) {
		char[] a = s.toCharArray();
		char t = a[i];
		a[i] = a[j];
		a[j] = t;
		return new String(a);
	}

	static void permutation(String s, int start, int end) {
		if (start >= end) {
			System.out.println(s);
		return;
		}
		for (int i = start; i <= end; i++) {
			String s1 = swap(s, start, i);
			permutation(s1, start + 1, end);
		}
	}

	public static void main(String[] args) {
      permutation("abc", 0, 2);
	}

}
