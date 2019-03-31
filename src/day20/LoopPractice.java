package day20;

import java.util.Scanner;

public class LoopPractice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		String name = "Hurma"; //  = scan.next(); 
		
		// Task 1 :
		
		// print our name char by char using do while loop 
		// Hurma --> H u r m a 
		// use do while loop 
		int x = 0 ; 
		do {
			System.out.print(name.charAt(x) + " ");
			x++ ; // x = x + 1 ; 
		}while(x<name.length()); 
		
		while(x<name.length()) {
			System.out.print(name.charAt(x) + " ");
			x++ ; // x = x + 1 ; 
		}
//		
//		if(x<name.length()) {
//			System.out.print(name.charAt(0) + " ");
//			
//		}
//		x++ ; 
//		if(x<name.length()) {
//			System.out.print(name.charAt(1) + " ");
//		}
//		x++ ; 
//		if(x<name.length()) {
//			System.out.print(name.charAt(2) + " ");
//		}
//		
//		System.out.print(name.charAt(3) + " ");
//		System.out.print(name.charAt(4) + " ");
//		
//		
//		
//		
//		
//		
////		String fUp = name.substring(0,1).toUpperCase(); 
////		String expected = fUp + name.substring(1); 
////		
////		System.out.println( expected);
//		//char c = name.charAt(0); 
//
////		System.out.println(name.charAt(0)+""+name.substring(1));
//		
//		
//		
//		

	}

}
