package com.Array.java;

public class Test1 {

	static void m1(int [] a) {
		for (int n : a) {
			System.out.println(n+ "");
			System.out.println();
		}
	}
	public static void main(String[] args) {
       int []a= {2,3,5};
       m1(a);
       int [] b= {1,2,4,5};
       m1(b);
	}

}
