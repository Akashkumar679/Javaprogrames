package javaExceptin;
class A{
	
}
class B extends A{
	void m1() {
		System.out.println("class Method");
	}
}
public class ClassCast {

	public static void main(String[] args) {
//    B a=(B)new A();
//    a.m1();
		try {
			B a= (B) new A();
			a.m1();
		}
		catch ( Exception e ) {
			System.out.println("Class Cast");
		}
		
	}

}
