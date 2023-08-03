package com.hashing.java;

public class Node {
	Object key;
	Node next;

	public Node(Book book) {
		key = book;
		next = null;
	}

	public Node(int k, Node n) {
		key = k;
		next = n;
	}
}
