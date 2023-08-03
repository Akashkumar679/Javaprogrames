package com.akash;

import java.util.StringJoiner;

public class StringJoin {

	public static void main(String[] args) {
		
		StringJoiner joiner = new StringJoiner(",","[","]");
		
		joiner.add("A").add("B").add("C");
		System.out.println(joiner);
		
		StringJoiner joiner2 = new StringJoiner(":");
		joiner2.add("P").add("Q");
		
		System.out.println(joiner2);
		System.out.println(joiner.merge(joiner2));
	}

}
