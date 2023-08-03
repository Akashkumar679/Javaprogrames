package Multithreading;

import java.util.Scanner;

public class Facebook {

	public static void main(String[] args) {
//		Scanner str = new Scanner(System.in);
//		System.out.println("Enter your name");
//		String name = str.next();
//		System.out.println("Enter your pswd");
//		int pswd = str.nextInt();
		String name="Akash";
		int pswd=7894;
		if (name.equals("Akash")) {
			if (pswd == 7894) {
				System.out.println("login done");
			} else
				try {
					throw new Wrongpassword();
				} catch (Wrongpassword e) {
					System.out.println("invalid password");
				}
		}
		else System.out.println("Enter valid user name");

	}

}
