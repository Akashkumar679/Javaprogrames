package com.akash.set;

import java.util.HashSet;

public class HashSetprograme {

	public static void main(String[] args) {
		
		HashSet<Object> s=new HashSet<Object>();
		
		int [] b= {1,2,1,4,5,2,1,3,6,4,7,8,9,6,1};
		for(int i=0;i<b.length-1;i++) {
			s.add(b[i]);
		}
		System.out.println(s);
	}

}
