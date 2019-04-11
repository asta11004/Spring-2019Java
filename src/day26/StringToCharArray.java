package day26;

import java.util.Arrays;

public class StringToCharArray {

	public static void main(String[] args) {
		
		String str = "Spartan" ;  // 7 
		
		int size = str.length() ; 
		
		//char[] myChars = new char[ size ]; 
		
//		myChars[0] =  str.charAt(0) ;
//		myChars[1] =  str.charAt(1) ;
//		myChars[2] =  str.charAt(2) ;
//		myChars[3] =  str.charAt(3) ;
//		myChars[4] =  str.charAt(4) ;
//		myChars[5] =  str.charAt(5) ;
//		myChars[6] =  str.charAt(6) ;
//		
		
//		for(int i=0 ; i< myChars.length ; i++) {
//			
//			//myChars[0] =  'A' ; 
//			myChars[i] = str.charAt(i) ; 
//			
//		}
//		
//		// toCharArray method is a method form String class 
		// and it will take no external data when being called 
		// and it will return character array that have each char of String object
		
		char[] myChars = str.toCharArray(); 
		System.out.println(Arrays.toString(myChars)   );
		
		
		
		
		
		
		

	}

}
