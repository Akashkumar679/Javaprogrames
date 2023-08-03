package cm.abstraction;

abstract class Animal {
	public void drink() {
		System.out.println("Water");
	}

	public void Sound() {
	}

	public void movement() {
	}
}

class lion extends Animal {
	@Override
	public void Sound() {
		System.out.println("Roar");
	}

	@Override
	public void movement() {
		System.out.println("walk");
	}

	public void eat() {
		System.out.println("non-veg");
	}
}

public class Wildlife {

	public static void main(String[] args) {
		Animal a = new lion();
		a.drink();
		a.Sound();
		a.movement();
		lion b = (lion) a;
		b.eat();
	}
}
