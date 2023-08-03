package com.Exception;

public class NullpointerException {

	public static void main(String[] args) {
		/*
		 * String s1=null; System.out.println(s1.charAt(2));
		 */
		try {
			String s1=null;
			System.out.println(s1.charAt(2));
		} catch (Exception e) {
			System.out.println("Exception handled");
		}
		
	}

}
