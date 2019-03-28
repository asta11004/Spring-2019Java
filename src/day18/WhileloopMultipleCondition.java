package day18;

import java.util.Scanner;

public class WhileloopMultipleCondition {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in) ; 
		
		// create a dynamic counter program 
		// ask user a number 
		
		// if user enter 5  ---->>> 1 2 3 4 5
		// if user enter 7  ---->>> 1 2 3 4 5 6 7 
//
//		System.out.print("abc ");
//		System.out.println("efg");
		System.out.println("ENTER YOUR TARGET NUMBER: ");
		int targetCount = scan.nextInt() ; 
		int x = 1 ; 
		
		while( x <= targetCount ) {
			
			System.out.print(x  + " ");
			x++ ; 
		}
		//System.out.println();
		System.out.println();
		System.out.println("END");
		
		

		
		
		

	}

}
