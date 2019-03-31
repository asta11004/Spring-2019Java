package day19;

public class StairCase {

	public static void main(String[] args) {
		
		// task 4 : 
		
		// you have string 
		String star = "J"; 
		// use while loop to generate 
//				*
//				**
//				***
//				****
//				*****
		// you may directly print or store the result ; 
		
		// 
//		int x = 1 ; 
//		while(x<=5) {
//			System.out.println(star);
//			star = star + "*" ; 
//			x++ ; 
//		}
		int x = 1 ; 
		String allStar = "" ; 
		while(x<=5) {
			
			allStar = allStar + star ; 
			System.out.println(allStar);
			x++ ; 
		}
		System.out.println(allStar);
		
		// how to we get *****  --> *
		
		

				
		

	}

}
