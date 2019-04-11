package day26;

import java.util.Arrays;

public class SplittingTheStrings {

	public static void main(String[] args) {
		
		
		String str = "Java is fun, java is challenging";
		
		String[] words =  str.split(" "); 
		System.out.println( Arrays.toString(words) );
		
		String[] parts =  str.split("a"); 
		System.out.println( Arrays.toString(parts) );
		
		String[] parts2 =  str.split("is"); 
		System.out.println( Arrays.toString(parts2) );
		
		
		
		
		
		

	}

}
