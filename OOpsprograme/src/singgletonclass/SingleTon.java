package singgletonclass;

class test {
	private static test t = null;

	private test() {
	}
	public static test getinstance() {
		if(t==null) {
			t=new test();
		}
		return t;
	}
}

public class SingleTon {
	public static void main(String[] args) {
		test t1=test.getinstance();
		test t2=test.getinstance();
		System.out.println(t1==t2);
	}

}
