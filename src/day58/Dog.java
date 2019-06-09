package day58;

public class Dog extends Animal 
				implements IndoorPet {
	@Override
	public void makeNoise() {
		System.out.println("WOOF WOOF");
	}
}
