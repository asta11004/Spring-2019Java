package day59;

import day58.*;

public class AnimalMethodHiding {

	public static void main(String[] args) {
		
//		Animal.doStatic();
//		Dog.doStatic();
//		Horse.doStatic();
		
		Animal myAnimal1 = new Dog();	
		myAnimal1.doStatic();
		
		Animal myAnimal2 = new Horse();	
		myAnimal2.doStatic();
		
		Animal myAnimal3 = new Cat();	
		myAnimal3.doStatic();

		
		

	}

}
