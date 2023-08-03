package com.akash.exmaple;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=s.nextInt();
		boolean flag=true;
		for (int i = 2; i <=n/2; i++) {
			if(n%i==0) {
				flag=false;
			break;
			}
		}
		if (flag) {
			System.out.println("it is prime");
		} else {
			System.out.println("not prime");
		}
	}

}
