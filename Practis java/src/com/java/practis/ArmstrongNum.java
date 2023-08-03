package com.java.practis;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
     Scanner x=new Scanner(System.in);
     System.out.println("Enter a number");
     int n=x.nextInt();
     int temp=n;
     int length=0;
     while (temp!=0) {
    	 temp%=10;
		length+=1;
	}
     int temp2=n,rem=0,arm=0;
     while (temp2!=0) {
		rem=temp2%10;
		int mul=1;
		for (int i = 0; i <=length; i++) {
			mul=mul*rem;
		}
		arm=arm+mul;
		temp2/=10;
     }
     if (arm==n) { 
		System.out.println("its Armstrong");}
     else {
    	 System.out.println("its not arm strong");}
}
}
