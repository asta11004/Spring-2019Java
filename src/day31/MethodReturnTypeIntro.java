package day31;

import java.util.Arrays;

public class MethodReturnTypeIntro {

	public static void main(String[] args) {
	
		String str = "You know nothing about Java Jon Snow" ; 
		
		int count = str.length() ; 
		
		System.out.println( count );
		System.out.println( str.length() );
		
		
		//String arrStr = Arrays.toString(str.toCharArray()) ; 
		
		int five = giveMeFive() ; 
		System.out.println(  five );
		System.out.println( giveMeFive()  );
		// you may call it like this just as we do with void method 
		giveMeFive() ; // but the result generated will be lost 
		
		String name = giveMeMyName(); 
		System.out.println( name );
		// you may call it like this just as we do with void method 
		giveMeFive() ; // but the result generated will be lost 
				
		
		System.out.println(  name.substring(0,2)   );
		
		
	}
	  
	public static String giveMeMyName() {
		
		return "Akbar" ; 
		
	}
	
	
	public static int giveMeFive() {
		
		return 5 ; 
		
	}
	
	
	

}
