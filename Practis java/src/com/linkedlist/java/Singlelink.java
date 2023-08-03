package com.linkedlist.java;

import java.util.Iterator;

public class Singlelink {
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
			last =last.next;
		}
		last.next = new Node(e, null);
		count++;
		return;
	}
	public int size() {
		return count;
	}
	public Object get(int index) {
		if (index<0 && index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		Node curr=first;
		for (int i = 1; i <=index; i++) {
			curr=curr.next;
		}
		return curr.ele;
		}
	public static void main(String[] args) {
		Singlelink l1 = new Singlelink();
		l1.add(46);
		l1.add(56);
		l1.add(89);
		l1.add(32);
		for (int i = 0; i <l1.size(); i++) {
			System.out.println(l1.get(i));
		}
	}
	}
