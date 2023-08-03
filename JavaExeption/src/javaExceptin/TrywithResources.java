package javaExceptin;

import java.util.Scanner;

public class TrywithResources {

	public static void main(String[] args) {

		try (Scanner sc=new Scanner(System.in)){
			String a=sc.next();
			System.out.println(a);
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
