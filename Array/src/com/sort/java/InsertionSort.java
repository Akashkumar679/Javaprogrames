package com.sort.java;

public class InsertionSort {
	public static void sort(int[]a) {
		for (int i = 1; i < a.length; i++) {
			int key = a[i];
			int j=i-1;
			while(j>-1&& a[j]>key) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}
	public static void main(String[] args) {
        int [] a = { 4, 6, 8, 3, 9, 1, 2 };
        System.out.println("Arry before Isertion sort");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();
        sort(a);
        System.out.println("Arry After Isertion sort");
		for (int n : a) {
			System.out.print(n + " ");
		}
	}

}
