package com.java.practis;


import java.util.Scanner;

public class Rangeofprime {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = x.nextInt();
		System.out.println("Enter a Range");
		int m = x.nextInt();
		for (int i = n; i <= m; i++) {
			boolean flag = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.println(" " + i);
		}
	}

}
