package carfactory;

import carInterface.Vechile;

public class Swift implements Vechile {

	@Override
	public void Start() {
		System.out.println("key strat");
	}

	@Override
	public void engine() {
		System.out.println("Power Engine");
	}

	@Override
	public void stop() {
		System.out.println("key stop");
	}

	@Override
	public void fuealcapcity() {
		System.out.println("50 liter");
	}

}
class Audi implements Vechile{

	@Override
	public void Start() {
		System.out.println("remote Start");
	}

	@Override
	public void engine() {
		System.out.println("Horse power");
	}

	@Override
	public void stop() {
		System.out.println("Remote stop");
	}

	@Override
	public void fuealcapcity() {
		System.out.println("90 Liter");
	}
	
}
class Driver{
	Vechile d;

	public Driver(Vechile d) {
		super();
		this.d = d;
	}
	public void driver() {
		d.Start();
		d.engine();
		d.stop();
		d.fuealcapcity();
	}
}
class Carfactory{
	public static void main(String[] args) {
		Driver d1 = new Driver(new Audi());
		d1.driver();
		Driver d2 = new Driver(new Swift());
		d2.driver();
	}
}