package com.aksh.basic;

import java.util.Scanner;

public class FibonaciSeries {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num:");
		int x = sc.nextInt();
		int a = 0, b = 1, c = 0;
		while (a <= x) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(a+" ");
		}
	}

}
