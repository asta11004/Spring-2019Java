package day20;

public class DoWhileSum {

	public static void main(String[] args) {
		
		
		// TASK 3 : 
		// use do while loop to get the sum of
		// 1 till 10 (optionally use scanner to get 10) 
		int sum = 0 ; 
		int x = 1 ; 
		// OPTIONAL :
		// if the sum is more than 40 break out of the loop 
		do {
			
			sum = sum + x ; // sum += x ; 
			System.out.println("x: " + x + "  sum : "+sum );
			
			x++; 
			
//			if(sum>40) 
//				break; 
		
		}while(x<=10); 
		
		
		

	}

}
