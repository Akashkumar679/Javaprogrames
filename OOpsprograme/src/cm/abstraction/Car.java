package cm.abstraction;

 class Car {
	public void m1() {
		System.out.println("Akash");
	}
 public void m2() {
}
 public void m3() {
}
}
class B extends Car{

	@Override
	public void m2() {
		System.out.println("kumar");
	}

	@Override
	public void m3() {
		System.out.println("behera");
	}
	public void m4() {
		System.out.println("method m4");
	}
}
class test{
	public static void main(String[] args) {
		Car b = new B();
		b.m1();
		b.m2();
		b.m3();
		B a=(B)b;
		a.m4();
	}
}
