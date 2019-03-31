package day20;

public class ForLoopIntro {

	public static void main(String[] args) {
		
		for(int i = 0 ; i<5 ; i++) {
			
			System.out.println(" Okan Happy Birthday ");
			
		}
		
		// count from 1 to 10 
		// 1 2 3 4 5 6 7 8 9 10 
		
		for (int i = 1; i <= 300; i++) {
			System.out.print(i + " ");
		}

		// count from 10 to 1 
		// 10, 9, 8, 7, 6, 5, 4, 3, 2, 1
		System.out.println();
		
//		//int x = 5 ; 
//		while(x>0) {
//			System.out.print(x + " " );
//			x-- ; 
//		}
		/// if you have one statement curly braces are optional
		for(int x = 5 ;x>0 ; x--) {
			System.out.print(x + " " );
		}
		System.out.println();
		
		for(int x = 5 ;x>0 ; x--) 
			System.out.print(x + " " );
		
		
		

	}

}
