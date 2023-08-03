package com.hashing.java;

public class booktest {

	public static void main(String[] args) {
		Book b1=new Book("java",270);
		Book b2=new Book("Sql",70);
		Book b3=new Book("js",170);
		Book b4=new Book("Angular",170);
		Set s1=new Set();
		s1.add(b1);
		s1.add(b2);
		s1.add(b3);
		s1.add(b4);
		System.out.println("size"+s1);
		s1.display();
		
	}

}
