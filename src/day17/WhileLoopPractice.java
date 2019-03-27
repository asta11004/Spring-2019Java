package day17;

public class WhileLoopPractice {

	public static void main(String[] args) {
		
		// Task 2  print even numbers from 0-10 
		
		int x = 0 ; 
		
		// How many iteration do we have 6 
//		while(x <= 10) {
//			
//			System.out.println("value of x is " + x );
//			x += 2 ; // x = x+2 
//		}
		// How many iteration do we have 11 
		while(x < 11) {
			
			if( x%2==0 ) {
				System.out.println("value of x is " + x );
			}
			x++ ; 
		}
		
		//  TASK 3 : 
		// print out all the odd numbers within 50-100
		int z= 50;
		while ( z<100) {
			
			if (z%2==1) { // z%2!=0
				System.out.println("value of z is " + z);
			}
			z++;
		}
		
		
		
		
		// OPTIONAL TASK : print only even number between 50-70
		// and odd number for the rest in one while loop 
		
		
		
		
		

	}

}
