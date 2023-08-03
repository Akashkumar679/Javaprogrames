package com.Exception;

import java.util.Scanner;

public class TrywithResources {

	public static void main(String[] args) {
		try(Scanner scn=new Scanner(System.in))
		{
		String s=scn.next();
		System.out.println(s);
		scn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
