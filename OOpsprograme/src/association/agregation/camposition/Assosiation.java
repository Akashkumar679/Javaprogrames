package association.agregation.camposition;

class A{
	public void m1() {
		System.out.println("m1 method");
	}
}
class B extends A{
	public void m2() {
		A a=new A();
		a.m1();
	}
}
public class Assosiation {

	public static void main(String[] args) {
		A b =new B();
		b.m1();
	}

}
