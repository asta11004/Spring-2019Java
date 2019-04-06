package day23_nested_loop_array.array;

public class CreatingArray2 {

	public static void main(String[] args) {
		
		
		// once array is created with a given size 
		// it can not be changed 
		int[] numbers = new int[2]; 
		// ASSIGNING VALUE to array
			
		numbers[0] = 10 ; 
		numbers[1] = 15 ;	
		numbers[0] = 100 ;
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		
		numbers = new int[4]; 
		System.out.println(numbers[0]);
		
		
		//ArrayIndexOutOfBoundsException will occure when 
		// you go out of range
	//	numbers[2] = 28 ;
	//	numbers[3] = 20 ;
		
		

	}

}
