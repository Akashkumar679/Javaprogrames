package com.aksh.basic;

import java.util.Scanner;

public class PerfactNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Num:");
		int n = sc.nextInt();
		int sum = 0;
		int i = 1;
		while (i < n / 2) {
			if (n % i == 0) {
				sum = sum + i;
			}
			i++;
		}
		if (sum==i) {
			System.out.println("perfact");
		} else {
			System.out.println("not perfact");
		}
	}
}