package com.js.rectangle;

public class Rectangle {
	int length;
	int breadth;

	public Rectangle(int length, int breadth) {
		this.breadth = breadth;
		this.length = length;
	}

	@Override
	public boolean equals(Object arg) {
		if (!(arg instanceof Rectangle))return false;
		Rectangle r = (Rectangle) arg;
		return length == r.length && breadth == r.breadth;
	}

	@Override
	public String toString() {
		return "Rectangle[length=" + length + ",breadth=" + breadth + "]";
	}
}
