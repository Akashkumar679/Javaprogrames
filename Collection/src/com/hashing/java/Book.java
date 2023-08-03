package com.hashing.java;

public class Book {
	String title;
	int pages;

	public Book(String t, int p) {
		super();
		this.title = t;
		this.pages = p;
	}

	@Override
	public boolean equals(Object arg) {
		if (!(arg instanceof Book))
			return false;
		Book b = (Book) arg;
		return title.equals(b.title) && pages == b.pages;
	}

	@Override
	public int hashCode() {
		return pages;
	}
	public int size() {
		return pages;
	}
	@Override
	public String toString() {
		return "Book[title=" + title + ",pages=" + pages + "]";
	}
}
