package com.java.practis;

import java.util.Scanner;

public class Binartodecimal {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=x.nextInt();
		int i=1;
		int dec=0;
		while (n>0) {
		    dec=dec+(n%10)*i;
			i=i*2;
			n/=10;
		}
		System.out.println(dec);
	}

}
