package com.sort.java;

public class QuickSort {

	public static void sort(int[] a,int start,int end) {
		if (start >= end)
			return;
		int i = start, j = end;
		int paivot = a[(i + j) / 2];
		while (i <= j) {
			while (a[i] < paivot)
				i++;
			while (a[j] > paivot)
				j--;
			if (i <= j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		sort(a, start, j);
		sort(a, i, end);
	}

	public static void main(String[] args) {
		int[] a = { 4, 3, 8, 6, 1, 2 };
		sort(a,0,a.length-1);
		for (int i : a) {
			System.out.println(i);
		}

	}

}
