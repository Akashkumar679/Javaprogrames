package com.java.practis;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=x.nextInt();
		int sum=0;
		int temp=n;
		while(n>0) {
			int prod=1;
			int rem=n%10;
			for (int i = 0; i <=rem; i++) {
				prod=prod*i;
			}
			sum+=prod;
			n/=10;
		}
		if (sum==n) {
			System.out.println("strong");
		}
		else {
			System.out.println("not strong");
		}
	}

}
