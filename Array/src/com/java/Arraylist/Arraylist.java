package com.java.Arraylist;

public class Arraylist {
	private Object[] a = new Object[5];
	private int p = 0;

	public void add(Object e) {
		if (p > a.length)
			incresecapacity();
		a[p] = e;
		p++;
	}

	public void add(int index, Object e) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		if (p >= a.length)
			incresecapacity();
		for (int i = size() - 1; i >= index; i--) {
			a[i + 1] = a[i];
		}
		a[index] = e;
		p++;
	}

	private void incresecapacity() {
		Object[] temp = new Object[a.length + 3];
		for (int i = 0; i < a.length; i++) {
			temp[i] = a[i];
		}
		a = temp;
	}

	public int size() {
		return p;
	}

	public Object get(int index) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		return a[index];
	}

	public void remove(int index) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		for (int i = index + 1; i < size(); i++) {
			a[i - 1] = a[i];

		}
		p--;
		a[p] = null;
	}

	@Override
	public String toString() {
		if (size() == 0)
			return "[]";
		String s = "[" + a[0];
		for (int i = 1; i < size(); i++) {
			s = s + "," + a[i];
		}
		s += "]";
		return s;
	}

}
