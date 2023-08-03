package com.java.linklist;

public class Linklist {
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
		last.next = new Node(e,null);
		count++;
		return;
	}
	public void add(int index, Object e) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		if (index == 0) {
			first = new Node(e, first);
			count++;
			return;
		}
		Node curr = first;
		for (int i = 1; i < index; i++) {
			curr = curr.next;

		}
		curr.next = new Node(e, curr.next);
		count++;
	}

	public int size() {

		return count;
	}

	public Object get(int index) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		Node curr = first;
		for (int i = 1; i <=index; i++) {
			curr = curr.next;
	}
		return curr.ele;
	}
	public void remove(int index) {
		
	}
	public void reverse() { //here we reverse 
		Node prev=null,curr=first,next=null;
		while (curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		first=prev;
	}
}
