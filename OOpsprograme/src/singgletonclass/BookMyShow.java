package singgletonclass;

import java.util.Scanner;

class Theater {
	 static int seats = 50;
	private static Theater t = null;

	public Theater() {

	}
	public static Theater getinstance() {
		if (t == null) t = new Theater();
		return t;
	}
	public void ReserveSeats(int n) {
		if (n > seats) {
			if (seats<=0)System.out.println("housefull");
			System.out.println(n + "seats not avilabe");
			System.out.println(seats + "seats are avilabe");
			return;
		}
		seats = seats - n;
		System.out.println(n + "seats are reserved");

	}
}
  class BookingApp {
	public void bookticket() {
		Scanner scn = new Scanner(System.in);
		System.out.println("how many Seats you want");
		int n = scn.nextInt();
		Theater t= Theater.getinstance();
		t.ReserveSeats(n);
	}
}
public class BookMyShow {
	public static void main(String[] args) {
		BookingApp c1 = new BookingApp();
		c1.bookticket();
		 BookingApp c2 = new BookingApp();
		 c2.bookticket();
		 BookingApp c3=new BookingApp();
		 c3.bookticket();
	}
}
