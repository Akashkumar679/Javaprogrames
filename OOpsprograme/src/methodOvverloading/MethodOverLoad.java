package methodOvverloading;
class A{
	public static int m1(int a,int b) {
		System.out.println("Akash");
		return 0;
	}
	public static int m1(float a,int b) {
		System.out.println("Mukesh");
		return 0;
	}
}
public class MethodOverLoad {

	public static void main(String[] args) {
		A a = new A();
		a.m1(0, 0);
		a.m1(0.6f, 0);
	}

}
