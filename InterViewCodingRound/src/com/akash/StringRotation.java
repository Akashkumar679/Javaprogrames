package com.akash;

public class StringRotation {

	public static boolean Rotation(String s,String s1) {
		return (s.length()==s1.length()) &&((s+s1).indexOf(s1)!=-1);
	}
	
	public static void main(String[] args) {
		String s="Akash";
		String s1="ahska";
		
		if (Rotation(s, s1)) {
			System.out.println("Rotation is present");
		} else {
			System.out.println("not present");
		}
	}

}
