package com.Basic;

import java.util.Scanner;

public class BiaryToDesimal {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter A number");
		int n=scn.nextInt();
		
		int dec=0;
		int i=1;
		while(n!=0) {
		dec=dec+(n%10)*i;
		i=i*2;
		n=n/10;
		}
		System.out.println(dec);
	}

}
