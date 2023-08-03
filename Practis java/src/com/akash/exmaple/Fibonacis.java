package com.akash.exmaple;

import java.util.Scanner;

public class Fibonacis {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int a=0,b=1,c=0;
		while(a<=n) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+a);
		}
	}

}
