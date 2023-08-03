package com.java.practis;

public class DEcimtob {
	public static void main(String[] args) {

		int n = 25;
		String b = "";
		while (n != 0) {
			int rem = n % 2;
			b = b + rem;
			n = n / 2;
		}
		System.out.println(b);

		/*
		 * int n=11001; int i=1,dec=0; while (n!=0) { dec=dec+(n%10)*i; i=i*2; n=n/10; }
		 * System.out.println(dec);
		 */
	}
}
