package createThread;

public class ImplemetsRunble implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			System.out.println("Aksh");
		}
	}

}

class demo {
	public static void main(String[] args) {
		ImplemetsRunble t = new ImplemetsRunble();
		Thread t1=new Thread(t);
		t1.start();
		
		for (int i = 1; i <= 3; i++) {
			System.out.println("Behera");
		}
	}
}
