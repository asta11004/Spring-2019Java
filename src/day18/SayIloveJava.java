package day18;

import java.util.Scanner;

public class SayIloveJava {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		String theAnswer = ""  ; 
		
		while(! theAnswer.equalsIgnoreCase("yes")) {
		
			System.out.println("DO YOU LOVE JAVA ? ");
			theAnswer = scan.next(); 
			
		}
		System.out.println("FINALLY , CORRECT ANSWER");

	}

}
