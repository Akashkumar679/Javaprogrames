package com.oops.Super;
class color{
	public void drow() {
		System.out.println("use color box");
	}
}
class red extends color{
	public void drow() {
		System.out.println("use pensil");
	}
	public void pain() {
		this.drow();
		super.drow();
		System.out.println("use to drowing");
	}
}
public class Supermethod {

	public static void main(String[] args) {
		new red().pain();
	}

}
