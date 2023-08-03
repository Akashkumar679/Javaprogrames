package com.java.linklist;

public class Linklistdemo {
public static void main(String[] args) {
	Node first=null;
	first=new Node(10);
	first.next=new Node(20);
	first.next.next=new Node(30);
	first.next.next.next=new Node(40);
	Node curentnode=first;
	while (curentnode!=null) {
		System.out.println(curentnode.ele);
		curentnode=curentnode.next;
	}
}
}
