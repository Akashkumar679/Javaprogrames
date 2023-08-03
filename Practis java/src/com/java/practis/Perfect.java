package com.java.practis;

public class Perfect {
public static void main(String[] args) {
	int n=6;
	int sum=0;
	while(n>0) {
		int rem=n%2;
		for (int i = 0; i <rem; i++) {
			sum+=i;
		}
		n=n/2;
	}if(sum==n) {
		System.out.println("perfect");
	}else {
		System.out.println("notperfect");
	}
}
}
