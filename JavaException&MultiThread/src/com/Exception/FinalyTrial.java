package com.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinalyTrial {

	public static void main(String[] args) {
		Scanner scn=null;
		try {
		scn=new Scanner(System.in);
		System.out.println("Enter a data");
		int a=scn.nextInt();
		int b=scn.nextInt();
		System.out.println(a+b);
		}
		catch(InputMismatchException e) {
			System.out.println("inputException handled");
		}
		finally {
			scn.close();
		}
	}

}
