package com.jsp.Stringclass;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FindMobileNum {

	static boolean isvalidnumber(String phone) {
		Pattern p= Pattern.compile("[6-9][0-9]{9}");
	    Matcher m= p.matcher(phone);
		return m.matches();
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
     Scanner x=new Scanner(System.in);
     System.out.println("Enter Phone Number:");
     String phn=x.next();
     if (isvalidnumber(phn)) System.out.println("Valid Number");
     else System.out.println("not valid");
	}

}
