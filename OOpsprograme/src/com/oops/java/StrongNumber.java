package com.oops.java;

import java.util.Scanner;

class factorial{
	public int factor(int num) {
		int fact=1;
		for (int i = 1; i <=num; i++) {
			fact*=i;
		}
		return fact;
	}
}
class Strong extends factorial{
	public int strong(int num) {
		int res=0;
		while (num>0) {
			int rem=num%10;
			res=res+factor(rem);
			num/=10;
		}
		return res;
	}
}
public class StrongNumber {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("Enter a num:");
		int number=x.nextInt();
		Strong s = new Strong();
		int result=s.strong(number);
		if (result==number) 
			System.out.println("Strong Num");
		else 
			System.out.println("Not a strong");
	}

}
