package com.akash.set;

import java.util.HashSet;

public class Setprograme {

	public static void main(String[] args) {
		int a[]= {1,45,2,1,8,3,6,1,2,5,89,1};
		
		HashSet<Object> set = new HashSet<Object>();
		for (int i = 0; i < a.length-1; i++) {
			set.add(a[i]);
		}
		System.out.println(set);
	}

}
