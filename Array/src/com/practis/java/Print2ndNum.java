package com.practis.java;

public class Print2ndNum {

	public static void main(String[] args) {
		int a[] = { 5, 4, 6, 7, 9, 2, 3 };
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=a.length) {
				System.out.println(a[i++]);
			}
		}
	}
}
