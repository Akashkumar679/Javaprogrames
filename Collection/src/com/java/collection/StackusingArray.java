package com.java.collection;

import java.util.EmptyStackException;

public class StackusingArray {
	Object[] a = new Object[10];
	int count = 0;

	public void push(Object e) {
		if (count >= a.length)
			incersecapacity();
		a[count++] = e;
	}

	private void incersecapacity() {
		Object[] arr = new Object[a.length + 5];
		for (int i = 0; i < a.length; i++) {
			arr[i] = a[i];
		}
		a = arr;
	}

	public Object pop() {
		if (isempty()) {
			throw new EmptyStackException();
		}
		count--;
		Object e = a[count];
		a[count] = null;
		return e;
	}

	public int size() {
		return count;
	}

	public boolean isempty() {
		if (count == 0)
			return true;
		return false;
	}

	public Object peek() {
		if (isempty()) {
			throw new IndexOutOfBoundsException();
		}
		return a[count - 1];
	}
}
