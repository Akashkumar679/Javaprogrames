package com.akash.exmaple;

import java.util.Scanner;

public class StrongNum {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scn.nextInt(); 
		int sum = 0,strong=1;
		while (n != 0) {
			int rem = n % 10;
			for (int i = 0; i <= rem; i++) {
				strong *= i;
			}
			sum += strong;
			n /= 10;
		}
			if (sum==n) {
				System.out.println("it is strong");
			} else {
				System.out.println("not strong");
			}
		}
	}
