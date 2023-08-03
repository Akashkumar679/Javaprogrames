package com.practis.java;

public class istrsort {
public static void sort(int[]a) {
	for (int i = 1; i < a.length; i++) {
		int key=a[i];
		int j=i-1;
		while(j>-1&&a[j]>key) {
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=key;
	}
}
	public static void main(String[] args) {
int []a= {8,6,5,3,4,2,9,1};
		sort(a);
		for (int n : a) {
			System.out.print(n+" ");
		}
	}

}
