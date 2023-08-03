package com.java.practis;

import java.util.Scanner;

public class desimalTobianary {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("Enter Desimal Number");
		int n=x.nextInt();
		String binary="";
		while(n!=0){
			int rem=n%2;
			binary+=rem;
			n=n/2;
		}
		System.out.println(binary);
	}

}
