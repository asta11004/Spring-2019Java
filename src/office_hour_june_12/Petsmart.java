package office_hour_june_12;

public class Petsmart {
	public static void main(String[] args) {
		Cat fluffy = new Cat();
		fluffy.speak();

		Animal animal = new Cat();

		animal.speak();
		animal.sleep();
		Dog sharik =  (Dog) animal;
		// Cat and Dog class they are siblings
		// they don't know about each other
		// casting is not working
//		sharik.sleep();
		// why we are getting cats version?
		// because, if we override method, our object will call
		// latest overridden version of the method.
		GermanShepherd rex = new GermanShepherd();
		//is a child class of Dog class
		//we can cast object of rex into object of Dog class
		rex.speak();
		Dog gsh = rex;
		gsh.speak();
	}
}
