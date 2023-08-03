package com.jsp.Stringclass;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidationPassword {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner x = new Scanner(System.in);
		System.out.println("Enter Your email");
		String email = x.next();
		System.out.println(" Enter password");
		String Password = x.next();
		String regularExpression = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$&]).{8,16}";
		String emailexpresion = "([a-z])(?=.*[0-9])(?=.*[.@#$&]).{8,30}";
		Pattern e = Pattern.compile(emailexpresion);
		Matcher n = e.matcher(email);
		System.out.println(n.matches());
		Pattern p = Pattern.compile(regularExpression);
		Matcher m = p.matcher(Password);
		System.out.println(m.matches());
	}

}
