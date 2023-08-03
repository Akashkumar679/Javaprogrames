package com.java.collection;

public class Stack {
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
	private Node first = null;
	private int count = 0;
	public void push(Object e) {
		if (first == null) {
			first = new Node(e);
			count++;
			return;
		}
		first = new Node(e, first);
		count++;
	}
	public int size() {
		return count;
	}
	public boolean isEmpty() {
		if (first == null)
			return true;
		return false;
	}
	public Object pop() {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException();
		}
		Object e = first.ele;
		first = first.next;
		count--;
		return e;
	}
	public Object peek() {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException();
		}
		return first.ele;
	}
}