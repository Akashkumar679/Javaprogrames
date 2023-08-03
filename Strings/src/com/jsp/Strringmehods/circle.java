package com.jsp.Strringmehods;

class circle {
	int redious;

	public circle(int redious) {
		this.redious = redious;
	}
	@Override
	public boolean equals(Object arg) {
		if(!(arg instanceof circle))return false;
		return redious==((circle)arg).redious;
	}
}

