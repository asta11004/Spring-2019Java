package day33;

import java.util.Arrays;

public class ReturningMultipleValue {

	// array can be used to return multipe value of same type
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myArray = giveMeAnArray();
		System.out.println( Arrays.toString(myArray)  )  ;
		
		// CALLLING in one shot 
		System.out.println( Arrays.toString( giveMeAnArray() )  )  ;
		
		
		
	}
	
	// this method have no paramter 
	// and return int array object as returned value 
	public static int[] giveMeAnArray() {		
		
		int[] arr = new int[] {1,2,3} ;	
		//return Arrays.toString(arr) ; 
		return arr ; 
		
	}
	
	// Task 2 
	/*
	 * create a static method called combineArray
	 * it takes 2  parameters  and both data type as double array 
	 * and return another double array with 2 array items combined
	 *  
	 *  example result of calling this method 
	 * {1.1,3.99, 2.2}  {2.4,2.88}  ---> {1.1,3.99, 2.2, 2.4,2.88} 
	 * */
	

}
