package com.java.Arraylist;

public class Arrylisttest {
	public static void main(String[] args) {
		Arraylist a1 = new Arraylist();
		a1.add(70);
		a1.add(30);
		a1.add(40);
		a1.add(60);
		a1.add(0, 10);
		a1.add(4, 50);
		a1.remove(0);
		System.out.println("size=" + a1.size());
		for (int i = 0; i < a1.size(); i++) {
//			System.out.println(a1.get(i));
			int n = (Integer) a1.get(i);
			System.out.println(n);
		}
		System.out.println(a1);
	}
}
