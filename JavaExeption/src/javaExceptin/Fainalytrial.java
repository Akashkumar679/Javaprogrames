package javaExceptin;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fainalytrial {

	public static void main(String[] args) {
		Scanner sanner=null;
		try {
			sanner=new Scanner(System.in);
			System.out.println("enter data");
			int a=sanner.nextInt();
			int b=sanner.nextInt();
			System.out.println(a+b);
		} catch (InputMismatchException e) {
			System.out.println("Enter intvalue");
		}
		finally {
		sanner.close();	
		}
	}

}
