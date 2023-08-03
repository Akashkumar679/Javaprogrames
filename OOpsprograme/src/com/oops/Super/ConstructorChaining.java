package com.oops.Super;
class D{
	D(){
		this(10);
		System.out.println("no -argument");
	}
	D(int i){
		this(10,20);
		System.out.println("1st agrument D");
	}
	D(int i,int j){
		System.out.println("2nd argument D");
	}
}
class C extends D{
	C(){
		this(20);
		System.out.println("no argument C");
	}
	C(int i){
		this(30,50);
			System.out.println("1 argument C");
		}
	C(int i,int j){
		System.out.println("2 argument C");
	}
}
public class ConstructorChaining {

	public static void main(String[] args) {
		new C(10);
	}

}
