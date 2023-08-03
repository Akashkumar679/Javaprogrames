package com.jsp.Stringclass;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		String s="Akash behera";
		StringBuilder str = new StringBuilder();
		s.chars().distinct().forEach(c-> str.append((char)c));
		System.out.println(str);
		
		StringBuilder sb2 = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int indx=s.indexOf(c,i+1);
			if(indx==-1) {
				sb2.append(c);
			}
		}
		System.out.println(sb2);
	}

}
