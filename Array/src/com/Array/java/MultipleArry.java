package com.Array.java;

public class MultipleArry {

	public static void main(String[] args) {

		int []a= {2,1,3,4,5,6,7};
		int mul=1;
		for (int i = 0; i < a.length; i++) {
			mul*=a[i];
		}
		System.out.println(mul);
	}

}
