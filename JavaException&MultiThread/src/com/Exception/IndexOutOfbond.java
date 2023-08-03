package com.Exception;

public class IndexOutOfbond {

	public static void main(String[] args) {
		/*
		 * int []a=new int[10]; System.out.println(a[18]);
		 */
		try {
			int a[]=new int[16];
			System.out.println(a[17]);
		} catch (Exception e) {
			System.out.println("HAndled");
		}
	}

}
