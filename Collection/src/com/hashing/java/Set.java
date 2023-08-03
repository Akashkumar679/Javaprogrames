package com.hashing.java;

public class Set {
	private static Node[] arr = new Node[10];
	private int count = 0;

	public boolean add(Book book) {
		int loc = hashCode()% arr.length;
		if (arr[loc] == null) {
			arr[loc] = new Node(book);
			count++;
			return true;
		}
		Node prev = null;
		Node curr = arr[loc];
		while (curr != null) {
			if (curr.equals(book))
				return false;
			prev = curr;
			curr = curr.next;
		}
		prev.next = new Node(book);
		count++;
		return true;
	}

	public int size() {
		return count;
	}

	public void display() {
		for (int i = 0; i < arr.length; i++) {
			Node curr = arr[i];
			while (curr != null) {
				System.out.println(curr.key);
				curr=curr.next;
			}
		}
	}
}
