package com.java.practis;

public class SelecttionSort {
	public static void sort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			if(i!=a.length) {
				int temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}

		}
	}

	public static void main(String[] args) {
		int[] a = { 4, 9, 7, 3, 6, 1, 2, 5 };
		sort(a);
		for (int n : a) {
			System.out.print(n);
		}
	}

}
