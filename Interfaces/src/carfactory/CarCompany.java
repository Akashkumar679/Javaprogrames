package carfactory;

public interface CarCompany {
public static void fuealcapacity() {
	System.out.println("50 liter");
}
public void Start();
public void ecsselator();
public void Break();
public void Stop();
}


class Tata implements CarCompany{

	@Override
	public void Start() {
		System.out.println("Remote");
	}

	@Override
	public void ecsselator() {
		System.out.println("Button press");
	}

	@Override
	public void Break() {
		System.out.println("Push Break");
	}

	@Override
	public void Stop() {
		System.out.println("Hnad Break");
	}
	
}
class Honda implements CarCompany{

	@Override
	public void Start() {
		System.out.println("Key Start");
	}

	@Override
	public void ecsselator() {
		System.out.println("Key ecesslator");
	}

	@Override
	public void Break() {
		System.out.println("Key Break");
	}

	@Override
	public void Stop() {
		System.out.println("Key Stop");
	}
	
}
class Suzuki implements CarCompany{

	@Override
	public void Start() {
		System.out.println("Self Start");
	}

	@Override
	public void ecsselator() {
		System.out.println("Hand Ecceselator");
	}

	@Override
	public void Break() {
		System.out.println("leg Break");
	}

	@Override
	public void Stop() {
		System.out.println("Hand Break");
	}
	
}
 class driving{
 CarCompany d;

public driving(CarCompany d) {
	super();
	this.d = d;
}
 public void Drive() {
	 d.Start();
	 d.ecsselator();
	 d.Break();
	 d.Stop();
 }
}
 
class testCar{
	public static void main(String[] args) {
		driving s1 = new driving(new Honda());
		s1.Drive();
	}
}