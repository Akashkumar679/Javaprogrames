package com.Array.java;

public class RemoveDuplicate {
	public static int Remove(int a[]) {
		int j=0;
		for (int i = 0; i < a.length-1; i++) {
			if (a[i]!=a[i+1]) {
				a[j]=a[i];
				j++;
			}
		}
		a[j]=a[a.length-1];
		return j;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 20, 30, 30, 40, 50, 50 };
		int length = arr.length-1;
		Remove(arr);
		for (int i = 0; i < length-1; i++)
			System.out.print(arr[i] + " ");
	}
}