package day26;

import java.util.Arrays;

public class SplittingTheStrings {

	public static void main(String[] args) {
		
		
		String str = "Java is fun";
		
		String[] words =  str.split(" "); 
		
		System.out.println( Arrays.toString(words) );
		

	}

}
