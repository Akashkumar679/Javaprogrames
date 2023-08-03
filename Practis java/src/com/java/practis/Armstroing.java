package com.java.practis;

import java.util.Scanner;

public class Armstroing {
public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	System.out.println("enter a num");
	int n=x.nextInt();
	int temp=n;
	int length=0;
	while (temp!=0) {
		temp=temp/10;
		length+=1;
	}
	int temp2=n,arm=0,rem=0;
	while (temp2!=0) {
		rem=temp2%10;
		int mul=1;
		for (int i = 1; i <=length; i++) {
			mul=mul*rem;
		}
		arm=arm+mul;
		temp2/=10;
	}
	if (arm==n) {
		System.out.println("armstrong");
	} else {
		System.out.println("not arm");
	}
}
}
