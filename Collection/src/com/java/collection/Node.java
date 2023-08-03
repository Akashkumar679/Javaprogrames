package com.java.collection;

public class Node {
	Object ele;
	Node next;

	Node(Object e) {
		ele = e;
		next = null;
	}

	public Node(Object e, Node n) {
		ele = e;
		next = n;
	}
}
