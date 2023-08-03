package com.jsp.String;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailVallidation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Email");
		String email = sc.next();
		String emailexpression = "(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%&.])(?=.*[0-9]).{8,16}";
		Pattern p=Pattern.compile(emailexpression);
		Matcher m=p.matcher(email);
		System.out.println(m.matches());
	}

}
