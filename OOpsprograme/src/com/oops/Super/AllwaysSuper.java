package com.oops.Super;
class perent{
	int j;
	public perent(int j){
		this.j=j;
		System.out.println("perent class");
	}
}
class childs extends perent{
	int i;
	public childs(int i){
		super(21);
		this.i=i;
		System.out.println("child class");
	}
}
public class AllwaysSuper {

	public static void main(String[] args) {
		childs c1 = new childs(2);
	}

}
