package association.agregation.camposition;
class C {
	public void m1(){
	System.out.println("m1()method" );	
	}
}
class D{
	C a;
	public D(C a){
		this.a=a;
	}
	public void m2() {
		a.m1();
	}
}
public class Camposition {

	public static void main(String[] args) {
		D b=new D(new C());
		b.m2();
	}

}
