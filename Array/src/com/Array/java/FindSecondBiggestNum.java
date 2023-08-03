package com.Array.java;

public class FindSecondBiggestNum {

	public static void main(String[] args) {
		int a[] = { 4, 1, 2, 5, 7, 9, 6, 3, 8 };
		int first = a[0];
		int second = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] == first)
				continue;
			if (a[i] > first) {
				second = first;
				first = a[i];
			} else if (first == second || a[i] > second) {
				second = a[i];
			}
		}
		System.out.println(second);
	}

}

