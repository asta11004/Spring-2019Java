package day23_nested_loop_array.array;

public class CreatingArray3 {

	public static void main(String[] args) {
		
		
		// once array is created with a given size 
		// it can not be changed 
		int[] numbers = new int[2]; 
		// ASSIGNING VALUE to array
		
		// 2nd way to create an array with predefined items 
		
		// dataType [] variableName = new dataType[]{item1, item2 , item3....}
		int[] nums ; 
			  nums = new int[] {1,3,4,5,8,9,0,4,-2} ;
		
		// getting the size of an array 
		
		int size = nums.length ; 
		System.out.println( size);
		
		nums[0] =  100 ; 
		System.out.println( nums[0] );
		System.out.println( nums[size-1] );
		
		
		/// final way to create an array 
		// declaring and assigning value like this 
		// can only happen in one statement 
		int[] nums2 = {1,2,3,5,6,7,8,8,89,9,19,92,82,18} ; 
		
		// thid will not compile
//		int[] num3 ; 
//			num3 = {1,2,3,4} ; 
		
		System.out.println(  nums2.length   );
		
		
		
		
		
		
		
		
		

	}

}
