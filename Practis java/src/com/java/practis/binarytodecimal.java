package com.java.practis;

import java.util.Scanner;

public class binarytodecimal {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("Enter a Bianary");
		int n=x.nextInt();
		int desimal=0;
		int i=1;
		while (n>0) {
			desimal=desimal+(n%10)*i;
			i=i*2;
			n=n/10;
		}
		System.out.println(desimal);

	}

}
