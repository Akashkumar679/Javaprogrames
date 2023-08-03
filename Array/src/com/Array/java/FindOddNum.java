package com.Array.java;

public class FindOddNum {

	public static void main(String[] args) {
		int a[]= {4,2,5,1,7,6,7,8};
		
		for (int i = 0; i < a.length; i++) {
		
			if (i%2!=0) {
				System.out.println(a[i]);
			}
		}
	}

}
