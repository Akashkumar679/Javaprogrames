package com.aksh.basic;

import java.util.Scanner;

public class StrongNum {

	public static int factor(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Strong Num:");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0, rem;

		while (n > 0) {
			rem = n % 10;
			sum = sum + factor(rem);
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println("strong");
		} else {
			System.out.println("not strong");
		}
	}

}
