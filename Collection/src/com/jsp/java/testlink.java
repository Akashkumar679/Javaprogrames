package com.jsp.java;

public class testlink {

	public static void main(String[] args) {
		linklist l = new linklist();
		l.add(25);
		l.add(63);
		l.add(45);
		l.add(65);
		for (int i = 0; i < l.size(); i++) {
			System.out.print(l.get(i)+" ");
		}
		System.out.println();
		l.reverse();
		for (int i = 0; i < l.size(); i++) {
			System.out.print(l.get(i)+" ");
		}
		System.out.println();
	}

}
