package day23_nested_loop_array.array;

import java.util.Scanner;

public class ArrayCreation {

	public static void main(String[] args) {
		

		// TASk 4
		// create an array of double with size 4
		// assign 4 value 
		// then print then all out 
		
		// dataType[] variableName = new dataType[4] ; 
		// dataType variableName[] = new dataType[4] ; 
		int i ; 
		i = 10 ; 
		
		
		double[] prices1 ; 
		prices1 = new double[4] ; 
		
		prices1[0] = 1.5 ; 
		prices1[3] = 2.12 ; 
		prices1[2] = 23.99 ; 
		prices1[1] = 12.32 ; 
		
		System.out.println(prices1[2] );
		
		
		//double prices2[] ; 
		// Task 5 : 
		/*
		 * declare boolean array variable that point to array of size 5 
		 * declare short array variable 
		 * 		and assign short array object that have capacity of 2 
		 * declare String array variable 
		 * 		and assign String array object that have capacity of 20 
		 * declare Scanner array variable
		 * 		and assign Scanner array object that have capacity of 15 
		 * */
		//// the number in [] is the capacity of array object
		boolean[] onOffs = new boolean[5] ; 
		short[] shortNum = new short[2]; 
		String[] strs  = new String[20]; 
		Scanner[] manyScan = new Scanner[15]; 
		
		  

	}

}
