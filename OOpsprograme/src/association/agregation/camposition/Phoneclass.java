package association.agregation.camposition;
class phone{
	String phoneBrand;
	Battery battery;
	public phone(String phoneBrand, Battery battery) {
		this.phoneBrand = phoneBrand;
		this.battery = battery;
	}
	public void call(sim s) {
		s.callingtype();
	}
}
class sim{
	String simtype;
	public sim(String simtype) {
		this.simtype=simtype;
	}
	public void callingtype() {
		System.out.println("Allows to use internet");
	}
}
class Battery{
	String batterybarnd;
	public Battery(String betterybrand) {
		this.batterybarnd=betterybrand;
	}
}
public class Phoneclass {

	public static void main(String[] args) {
		Battery b=new Battery("lithum");
		phone p=new phone("IQoo",b);
		p.call(new sim("Airtel"));
	}

}
