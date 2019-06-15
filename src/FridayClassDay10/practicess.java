package FridayClassDay10;

abstract class classA{
	
	protected abstract int Java();
	
}


abstract class classB extends classA {
	
	protected abstract double Python();
	
	// there are two abstract methods 
	
}


public class practicess extends classB {
	
//	 int Java() {
//			return 18;     //  access modifier of the override ethods needs to be same or more visibile 
//		}
	
		protected int Java() {
			return 18;
		}
		
		
		public double Python() {
			return 8;
		}
		

}


// final abstract class classC{ }      
/*
  when we apply final to the class, the class cannot be extended.	
  abstratc class in java  is a class that meant to be extended.
 
 */







