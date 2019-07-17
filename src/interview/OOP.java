package interview;

public class OOP {

	public static void main(String[] args) {
		
		/*
		 * A PIE 
		 * 
		 * ENCAPSULATION 
		 * 		--- HIDING DATA , HIDE THE ITERNAL WORKING OF THE DATA 
		 * 		 BY MAKING THE FIELD PRIVATE AND PROVIDE PUBLIC METHODS
		 * 		 access or modify the data 	
		 * 		
		 * 	    Good example of place we use this is in POJO Class 
		 * 		POJO  -- Plain old java object 
		 * 			 it has private fields , getter and setter s
		 *    			constructors to initialize the fields , toString Method 
		 * 	
		 * 
		 * INHERITANCE 
		 * 		--- IS-A | Parent Child RELATIONSHIP BEITWEEN CLASSES 
		 * 			to reuse the fields and methods rather that creating everything from scratch 
		 * 	
		 * 		 public class Person{
		 * 		   String name; 
		 * 		   int age ; 
		 * 		    // other methods 		
		 * 		 }
		 * 
		 *  	public class Customer extends Person{
		 * 		   
		 * 			int customerID ; 
		 * 		    // other methods 		
		 * 		}

		 * 		How many other class a class can extends --->> 1 
		 * 
		 * 		
		 * 		How many interface a class can implements --->> many 
		 * 
		 * 		How many other interface an interface can extends --->> many   	
		 * 
					interface Flyable{} 
					
					interface Moveavle{}
					
					interface Flyer extends Flyable , Moveavle {}	


		 * ABSTRACTION 
		 * 
		 * 
		 * 		 
		 * POLYMORPHISM 
		 * 
		 * 
		 * */
		
		

	}

}

interface Flyable{} 

interface Moveavle{}

interface Flyer extends Flyable , Moveavle {}













