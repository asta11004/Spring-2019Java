package day59;

import day58.*;

public class AnimalFieldHiding {

	public static void main(String[] args) {
		
		Animal myAnimal1 = new Dog();	
		System.out.println(myAnimal1.legsCount);
		myAnimal1.makeNoise();
		
		Animal myAnimal2 = new Horse();	
		System.out.println(myAnimal2.legsCount);
		myAnimal2.makeNoise();
		
		Animal myAnimal3 = new Cat();	
		System.out.println(myAnimal3.legsCount);
		myAnimal3.makeNoise();

	}
	// Fields are not overriden it's only hidden 
	// and only reference type decide what you can access
	// That's why there is no power of polymorphism is going on here
	// the field is being accessed is all coming from Animal class
	// at compile time and run time 

}
