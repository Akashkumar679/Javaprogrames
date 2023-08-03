package com.java.collection;

public class QueTest {

	public static void main(String[] args) {
		Queue q=new Queue();
		q.add(10);
		q.add(20);
		q.add(45);
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}
