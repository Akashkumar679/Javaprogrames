package com.Array.java;

public class FindBiggest {

	public static void main(String[] args) {
		int x[] = { 3, 2, 1, 4, 7, 6, 9, 8, 5 };
		int first = x[0];
		int second = x[0];
		for (int i = 1; i < x.length; i++) {
			if (first == x[i])
				continue;
			if (x[i] > first) {
				first = x[i];
				second = first;
			} else if (first == second || x[i] > second) {
				second = x[i];
			}
		}
		System.out.println(second);

	}

}
