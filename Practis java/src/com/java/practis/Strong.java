package com.java.practis;


public class Strong {
public static void main(String[] args) {
	int n=15,sum=0;
	int temp=n;
	while (n!=0) {
		int strong=1;
		int rem=n%10;
		for (int i = 1; i <=rem; i++) {
			strong=strong*i;
		}
		sum+=strong;
		n/=10;
	}
	if (sum==temp) {
		System.out.println("strong");
	}else {
		System.out.println("not strong");
	}
}
}
