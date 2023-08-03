package com.hashing.java;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistHashing {

	public static void main(String[] args) {
    ArrayList<Integer> a=new ArrayList<Integer>();
    a.add(20);
    a.add(32);
    a.add(5);
    a.add(60);
    System.out.println(a);
    Iterator<Integer> itr=a.iterator();
    while (itr.hasNext()) {
		Integer i = (Integer)itr.next();
		if(i%2!=0)itr.remove();
	}
    System.out.println(a);
	}

}
