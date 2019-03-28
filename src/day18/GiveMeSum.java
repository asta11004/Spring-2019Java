package day18;

public class GiveMeSum {

	public static void main(String[] args) {
		
		
		// how do you get the the sum of number 
		// starting from one till desiged number 
		// user input 5 --> 1+2+3+4+5 = 15 ; 
		
		int sum = 0 ; 
		// 1 + 0 = 1 
		// 2 + 1 = 3 
		// 3 + 3 = 6 
		// ..... 
		int count = 1 ; 
		
		while(count <=100) {
			
			sum = sum + count ; 
			System.out.println("current sum :"+sum + " count is "+ count );
			//System.out.println(count);
			count++;
		}
		
		System.out.println(sum);
			
		
		

	}

}
