package com.java.practis;

import java.util.Scanner;

public class ArmstongNum {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=x.nextInt();
		int length=0;
		int temp=n;
		while(temp!=0) {
			temp=temp/10;
			length+=1;
		}
		int temp2=n,arm=0,rem=0;
		while (temp2!=0) {
			rem=temp2%10;
			int mul=1;
			for(int i=1;i<=length;i++) {
				mul*=rem;
			}
			arm+=mul;
			temp2/=10;
		}
		if (arm==n) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("not armstrong");
		}
	}

}
