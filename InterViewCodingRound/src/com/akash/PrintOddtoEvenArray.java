package com.akash;

public class PrintOddtoEvenArray {

	public static void main(String[] args) {
		int a[]= {1,2,5,4,3,8,20,25};
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2!=0) {
				System.out.print(a[i]+" ");
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2==0) {
				System.out.print(a[i]+" ");
			}
		}
		
	}
}
