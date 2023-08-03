package com.sort.java;

public class MargeShort {
	private static void merge(int[] StartingIndex, int[] EndinIndex, int[] arr) {
		int i = 0, j = 0, k = 0;
		while (i < StartingIndex.length && j < EndinIndex.length) {
			if (StartingIndex[i] < EndinIndex[j]) {
				arr[k++] = StartingIndex[i++];
			} else {
				arr[k] = EndinIndex[j];
				j++;
				k++;
			}
		}
			while (i < StartingIndex.length) {
				arr[k] = StartingIndex[i];
				i++;
				k++;
			}
			while (j < EndinIndex.length) {
				arr[k] = EndinIndex[j];
				j++;
				k++;
			}
		}

	public static void sort(int[] a) {
		if (a.length==1)return;
		int[] l = new int[a.length / 2];
		int[] r = new int[a.length - l.length];
		int i = 0;
		while (i < l.length) {
			l[i] = a[i];
			i++;
		}
		int j = 0;
		while (j < r.length) {
			r[j] = a[i];
			i++;
			j++;
		}
		sort(l);
		sort(r);
		merge(l, r, a);
	}

	public static void main(String[] args) {
		int[] a = { 3, 6, 4, 8, 9, 2,1,5};
		System.out.println("Arry before merge sort");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();
        sort(a);
        System.out.println("Arry After merge sort");
		for (int n : a) {
			System.out.print(n + " ");
		}
	}

}
