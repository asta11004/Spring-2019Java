package officehourjune5;

public class Cow extends Animal{

	public Cow(String name, int age) {
		super(name, age);
	}

	@Override
	public void speak() {
		System.out.println("Moooo");
	}

}
