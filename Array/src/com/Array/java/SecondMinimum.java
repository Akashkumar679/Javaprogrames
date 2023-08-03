package com.Array.java;

public class SecondMinimum {

	public static void main(String[] args) {
		int[] a = { 5, 4, 2, 4, 3, 9, 7 };
		int first = a[0];
		int second = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] == first)
				continue;
			if (a[i] < first) {
				second = first;
				first = a[i];
			} else if (first == second || a[i] < second) {
				second = a[i];
			}
		}
		System.out.println(second);
	}

}
