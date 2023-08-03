package com.oops.java;

import java.util.Scanner;

class factoria{
	public int factor(int num) {
		int fact=1;
		for (int i = 1; i <=num; i++) {
			fact*=i;
		}
		return fact;
	}
}
class Strongnum extends factoria{
	public int factor(int num) {
		if(num==0 | num==1)return 1;
		return num*factor(num-1);
	}
	public int strong(int num) {
		int res=0;
		int rem=0;
		for (int i ;num>0;rem=num%10) {
			res+=factor(rem);
		}
		return res;
	}
}
public class RangeofstrongNum {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("Enter a num:");
		int series=x.nextInt();
		Strong s=new Strong();
		for (int i = 1; i <=series; i++) {
			if(i==s.strong(i))System.out.println(i);
		}
	}

}
