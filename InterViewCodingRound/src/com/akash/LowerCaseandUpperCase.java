package com.akash;

public class LowerCaseandUpperCase {

	public static void main(String[] args) {

		String str="MY NAME IS AKASH MY NAME IS AKASH";
		
		int mid=str.length()/2;
		
		String uppercase="";
		String lowercase="";
		
		for (int i = 0; i <str.length(); i++) {
			if (i<mid) {
				lowercase=lowercase+Character.toLowerCase(str.charAt(i));
			}else {
				uppercase=uppercase+Character.toUpperCase(str.charAt(i));
			}
		}
		System.out.println(lowercase+uppercase);
	}

}
