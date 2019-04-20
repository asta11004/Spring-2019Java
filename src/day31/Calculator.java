package day31;

import java.util.Scanner;

public class Calculator {

	public static void add(int a, int b) {
		System.out.println( a + b);
	}
	
	public static void subs(int a, int b) {
		System.out.println(a - b);

	}
	public static void mult(int a, int b) {
		System.out.println(a * b);

	}
	public static void div(int a, int b) {
		System.out.println(a / b);

	}
	public static void mod(int a, int b) {
		System.out.println(a % b);

	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt(); 
		int b = scan.nextInt() ; 
		
		  add(a, b); // -- print 130
		  subs(a, b); // -- print 70
		  mult(a, b); // -- print 3000
		  div(a, b); // -- print 3
		  mod(a, b); // -- print 10
		
		/*
		 * add two numbers       int 
		 * sub two numbers
		 * mult
		 * div
		 * mod 
		 * 
		 * add(100, 30)  -- print 130
		 * sub(100, 30)  -- print 70
		 * mult(100, 30)  -- print 3000
		 * div(100, 30)  -- print 3
		 * mod(100, 30)  -- print 10
		 * 
		 * OPTIONAL :
		 * calculate method that take 3 paramEters and do below 
		 *  
		 * calculate("+" , 100, 30)  -- print 130
		 * calculate("-" , 100, 30)  --  print 70
		 * calculate("*" , 100, 30)  -- print 3000
		 * calculate("/" , 100, 30)  -- print 3
		 * calculate("%" , 100, 30)  -- print 10
		 * calculate("abc" , 100, 30)  -- print INVALID OPERATION CODE
		 * 
		 * 
		 * 
		 * */

	}

}
