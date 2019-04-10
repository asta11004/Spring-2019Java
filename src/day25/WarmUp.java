package day25;
import java.util.Arrays;

public class WarmUp {

	public static void main(String[] args) {
		
		// Arrays is a class specifically desiged for 
		// working on array object with many pre-defiend methods 
		
		// Arrays.toString(yourArrayObjectInhere) --> [item1,item2.....lastItem]
		
		
		// create an array of int with capacity of 50 
		// store 1-50 inside 
		// print them out 
		
		int[] numbers = new int [5];
		numbers[0] = 1; 
		numbers[1] = 2; 
		numbers[2] = 3; 
		numbers[3] = 4; 
		numbers[4] = 5; 
		
		System.out.println( numbers  );
		System.out.println( Arrays.toString(numbers)  );

		int[] nums = new int [50];
		
//		nums[0] = 1; 
//		nums[1] = 2; 
//		nums[2] = 3; 
//		nums[3] = 4; 
//		nums[4] = 5;
// .....
//		nums[49] = 50;

		for (int i = 0; i < 50; i++) {
			nums[i] = i+1; 
		}
		System.out.println( Arrays.toString(nums)  ); 

//		nums[0] = 0;  
//		nums[1] = 2; 
//		nums[2] = 4; 
//		nums[3] = 6; 
//		nums[4] = 8;
// .....
//		nums[50] = 100;
		
		int[] evenNumbers = new int[51] ; 
		for (int i = 0; i <=50 ; i++) {
			evenNumbers[i] = i * 2 ; 
		}
		System.out.println( Arrays.toString(evenNumbers)  );

		
		
				
		
		
		
		// create another array of int with capacity of 50 
		// store even numbers from 0-100 inside
		// print them out 
		
		
		
		
		
		

	}

}
