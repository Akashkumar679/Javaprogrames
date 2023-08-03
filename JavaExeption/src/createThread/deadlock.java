package createThread;
class AA{
public synchronized void d1(B b)
{
	System.out.println("d1 method from AA class");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {}
	System.out.println("AA class is calling B class Last method");
	b.last();
	}
	public synchronized void last() {
		System.out.println("AA class last method");
}
}

class B {
public synchronized void d1(AA a) {
	System.out.println("d1 method form B class");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {}
	System.out.println("B class is calling AA class Last method");
	a.last();
	}
	public synchronized void last() {
		System.out.println("B class last method");
}
}

class MyThre extends Thread{
AA a = new AA();
B b = new B();

public void m1()
{
	this.start();   //main thread
	a.d1(b);
}

public void run()   //MyThre
{
	b.d1(a);
}
}
public class deadlock{
public static void main(String[] args) {
	MyThre t = new MyThre();
	t.m1();
}

}