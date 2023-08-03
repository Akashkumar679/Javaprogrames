package com.sort.java;

public class SelectionSort {
public static void sort(int[]a) {
	for (int i = 0; i < a.length - 1; i++) {
		int minIndex = i;
		for (int j = i + 1; j < a.length; j++) {
			if (a[j] < a[minIndex])
				minIndex = j;
		}
		if (i!=minIndex) {
			int temp=a[i];
			a[i]=a[minIndex];
			a[minIndex]=temp;
		}
	}
}
	public static void main(String[] args) {
		int[] a = { 4, 6, 8, 3, 9, 1, 2 };
		System.out.println("Arry before Selection sort");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		sort(a);
		System.out.println("Arry after Slection sort");
		for (int n : a) {
			System.out.print(n + " ");
		}
	}

}
