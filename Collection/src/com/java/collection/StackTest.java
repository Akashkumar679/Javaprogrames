package com.java.collection;

public class StackTest {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(10);
		s.push(30);
		s.push(40);
		s.push(80);
		s.push(60);
		s.push(50);
		while (!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}

}
