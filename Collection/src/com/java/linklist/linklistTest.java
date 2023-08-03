package com.java.linklist;

public class linklistTest {

	public static void main(String[] args) {
		Linklist l = new Linklist();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(67);
//		l.add(0, 5);
		for (int i = 0; i < l.size(); i++) {
			System.out.print(l.get(i)+" ");
		}
		System.out.println();
		l.reverse();
		for (int i = 0; i < l.size(); i++) {
			System.out.print(l.get(i)+" ");
		}
	}
}