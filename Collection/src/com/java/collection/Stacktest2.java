package com.java.collection;

public class Stacktest2 {

	public static void main(String[] args) {
		StackusingArray a1 = new StackusingArray();
		a1.push(10);
		a1.push(36);
		a1.push(40);
		a1.push(50);
		while (!a1.isempty()) {
			System.out.println(a1.pop());
		}
	}

}
