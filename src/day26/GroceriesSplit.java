package day26;

import java.util.Arrays;

public class GroceriesSplit {

	public static void main(String[] args) {
		

		// split method from String class is used to split up 
		// string into multiple pieces according to the dilemeter that provided
		// and return it as String array 
		// if the given delimeter does not exists in the string 
		// it will return a String array of size 1 with original String inside
		
		
		// Task num 5    
		// create a string called groceries 
		// add items separated by comma 
		// split them and print them out 
		/// find out size of split 
		/// find out length of each items 
		String groceries = "Tomatoes, potatoes, "
				+ "cheese, bread, onions, pepper, "
				+ "grapes, oranges, apples";
		
		//String[] items = groceries.split("SAJKDHASKJDHASKJDHAKSJHD"); 
		String[] items = groceries.split(","); 
		
		System.out.println(items.length);
		System.out.println(  Arrays.toString(items) );
		
		
		for (int i = 0; i < items.length; i++) {
			
			System.out.println( items[i].trim().length()     );
		}
		
		
		
		
		
	}

}
