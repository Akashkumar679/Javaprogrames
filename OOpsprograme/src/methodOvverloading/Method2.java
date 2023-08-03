package methodOvverloading;
class C{
	public int m2(int a ,int b) {
		System.out.println("behera");
		return 0;
	}
}
class B extends A{
	public int  m2(float a,double b) {
		System.out.println("kumar");
		return 0;
	}
}
public class Method2 {

	public static void main(String[] args) {
		B b = new B();
		b.m1(0, 0);
	}

}
