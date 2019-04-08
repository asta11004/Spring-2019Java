package day24;

import java.util.Scanner;

public class ScannerAndArrayMax {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in) ; 
		int[] arr = new int[3] ; 

		for (int i = 0; i < arr.length; i++) {
			
			System.out.println("enter number " + (i+1) );
			arr[i] = scan.nextInt();
			System.out.println( arr[i] );
		
		}
		
		
		
		int min = arr[0] ; 
		for (int i = 1; i < arr.length; i++) {
			
			if(arr[i]< min  ) {
				min = arr[i] ; 
			}
			
		}
		System.out.println("min value is : "+ min);
 		


	}

}
