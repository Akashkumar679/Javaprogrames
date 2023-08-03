package com.Array.java;

import java.util.Arrays;

public class FindMinimum {

	public static int getsmalest(int []a,int total) {
		Arrays.sort(a);
		return a[1];
		
	}
	public static void main(String[] args) {
		int[] a = { 5, 4, 6, 8, 3, 9, 7 };
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min)
				min = a[i];
		}
		System.out.println(min);
		System.out.println(getsmalest(a, a.length));
		
	}
}
