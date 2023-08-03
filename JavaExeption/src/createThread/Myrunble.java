package createThread;

public class Myrunble extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <=3; i++) {
		System.out.println("child class");
		}
	}
}

class test {
	public static void main(String[] args) {
      Myrunble s = new Myrunble();
      Thread t=new Thread(s);
      t.start();
      System.out.println(Thread.currentThread());
      for (int i = 1; i <=2; i++) {
  		System.out.println("Aksh class");
  		}
	}

}
