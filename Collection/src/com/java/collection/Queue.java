package com.java.collection;

public class Queue {
	private Node first = null;
	private int count = 0;

	public void add(Object e) {
		if (first == null) {
			first = new Node(e);
			count++;
			return;
		}
		Node last = first;
		while (last.next != null) {
			last = last.next;
		}
		last.next = new Node(e, null);
		count++;
		return;
	}

	public int size() {
		return count;
	}

	public Object peek() {
		if (first == null)
			return null;
		return first.ele;
	}

	public Object poll() {
		if (first == null)
			return null;
		Object e = first.ele;
		first = first.next;
		count--;
		return e;
	}

	public boolean isEmpty() {
		if (first == null)
			return true;
		return false;
	}
}
