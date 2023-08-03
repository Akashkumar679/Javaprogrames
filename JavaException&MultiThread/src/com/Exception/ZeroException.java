package com.Exception;

import java.util.Scanner;

public class ZeroException {

	public static void main(String[] args) {
		Scanner scn=null;
		try {
		scn=new Scanner(System.in);
		System.out.println(scn.next());
		}finally {
			scn.close();
		}
	}

}
