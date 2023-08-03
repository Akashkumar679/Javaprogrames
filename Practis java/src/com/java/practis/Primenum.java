package com.java.practis;

public class Primenum {

	public static void main(String[] args) {
		int n=6;
		boolean flag=true;
		for (int i = 2; i < n/2; i++) {
			if (n%i==0) {
				flag=false;
				break;
			}
		}if (flag) {
			System.out.println("prime num");
		} else {
			System.out.println("not prime");
		}
	}

}
