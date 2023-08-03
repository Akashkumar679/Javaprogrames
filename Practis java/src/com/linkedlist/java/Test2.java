package com.linkedlist.java;

public class Test2 {
public static void main(String[] args) {
	Linkedlist l = new Linkedlist();
	l.add(55);
	l.add(20);
	l.add(50);
	l.add(30);
	l.add(25);
	for (int i = 0; i <l.size(); i++) {
		System.out.println(l.get(i));
	}
}
}
