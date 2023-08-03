package com.hashing.java;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistcheck {

	public static void main(String[] args) {
		ArrayList<Object> a=new ArrayList<Object>();
		a.add(1);
		a.add(2);
		a.add(4);
		a.add(5);
		a.add(1);
		Iterator<Object> itr=a.iterator();
		while (itr.hasNext()) {
			 System.out.println(itr.next());
			
		}
	}

}
