package com.java.practis;

import java.util.Scanner;

public class Rengeofarm {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=x.nextInt();
		System.out.println("enter range");
		int m=x.nextInt();
			for (int i = n; i <=m; i++) {
				int temp=i,rem=0,arm=0;
				while(temp!=0) {
					rem=temp%10;
					arm=(rem*rem*rem)+arm;
					temp/=10;
				}
				if(arm==i)System.out.println(" "+i);
			}
	}

}
