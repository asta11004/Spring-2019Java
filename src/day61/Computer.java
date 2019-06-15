package day61;


public class Computer extends Electronic {
	@Override
	public void turnOn() {
		System.out.println("Turning on "
				+ "computer");
	}
	
	public void code() {
		System.out.println("coding");
	}
	
}