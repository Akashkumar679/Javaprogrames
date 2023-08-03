package com.akash.exmaple;

import java.util.Scanner;

public class ArmStrongNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int temp=n;
		int length=0;
		while (temp!=0) {
			temp=temp/10;
			length++;
		}
		int temp2=n,rem=0,sum=0;
		while (temp2!=0) {
			rem=temp2%10;
			int mul=1;
			for (int i = 1; i <=length; i++) {
				mul*=rem;
			}
			sum+=mul;
			temp2/=10;
		}
		
		if (sum==n) {
			System.out.println("it is armstrong");
		} else {
			System.out.println("it is not armstrong");
		}
	}

}
