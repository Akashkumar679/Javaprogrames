package com.aksh.basic;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		for (int i = n-1; i < 10; i++) {
			System.out.println(n+"x"+i+"="+n*i);
		}
	}

}
