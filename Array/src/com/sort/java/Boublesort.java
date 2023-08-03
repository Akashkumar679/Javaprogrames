package com.sort.java;

public class Boublesort {

	public static void sort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] a = { 4, 7, 2, 6, 8, 3, 1, 5};
		System.out.println("Arry before bouble sort");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		sort(a);
		System.out.println("After bouble sort");
		for (int n : a) {
			System.out.print(n + " ");
		}
	}

}
