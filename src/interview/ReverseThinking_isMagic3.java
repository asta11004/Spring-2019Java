package interview;

public class ReverseThinking_isMagic3 {

	public static void main(String[] args) {

		int[][] data = {
				 			{ 3, 1, 5 }, 
				 			{ 5, 3, 1 }, 
				 			{ 1, 5, 3 } 
					   };
		
		System.out.println( isMagic(data)  );

	}

	/*
	 * A 2D array is considered “magic” if the following are true: The array is
	 * square (N rows and N columns) The sums of each row, the sums of each column,
	 * and the sums of each diagonal are all equal. Complete the isMagic method so
	 * that it will determine whether a given array is magic.
	 */
	public static boolean isMagic(int[][] twoDArr) {

		// check whether it's a square or not
		/*
		 * if not square return false ;
		 * 
		 */
		int itemCount = twoDArr.length;
		int lastIndex = itemCount-1 ; 
		
		for (int[] each1DArray : twoDArr) {

			if (each1DArray.length != itemCount) {
				System.out.println("NOT A SQUARE , EXITING METHOD!");
				return false;
			}
		}
		System.out.println(" THIS IS A SQUARE !!!");

		/*
		 * // find the sum of any above requirement // then use it as reference point
		 * 
		 * // find sum of first row --- easiest /// now compare this sum to the rest of
		 * the sum requirement
		 */
		int targetSum = 0;
		for (int eachItem : twoDArr[0]) {
			targetSum += eachItem;
		}
		 /* // take this number and compare with row sum result of each rows // as long
		 * as one row sum does not match the number // RETRUN FALSE 
		 */
	
		 /* // take this number and compare with COLUMN sum result of each column // as long
		 * as one column sum does not match the number // RETRUN FALSE 
		 */
		
		
		/* // take this number and compare with diagnol sum result of each column // as long
		 * as one diagnol sum does not match the number // RETRUN FALSE 
		 */
		
		int diagnalSum = 0 ; 
		int diagnalSumR = 0 ; 
		

		for (int k = 0; k <itemCount; k++) {
			
			int rowSum = 0 ; 
			int colSum = 0 ; 
			// compared to version 2 of the code,
			// the requirement is not asking for detailed failure reason ,
			// we can directly put in one loop
			// will have to change the variable name to avoid confusion though 
			for (int m = 0; m < itemCount; m++) {
				
				rowSum +=   twoDArr[k][m] ; 
				colSum +=   twoDArr[m][k] ; 
				
			}
			
			if(targetSum!= rowSum || targetSum!= colSum) {
				System.out.println("Either one of row or column Sum did not match");
				return false ; 
			}
			diagnalSum  +=   twoDArr[k][k] ; 
			diagnalSumR +=   twoDArr[k][lastIndex - k] ; 
		}

		if(targetSum!= diagnalSum || targetSum!= diagnalSumR) {
			System.out.println("ONE OF diagonal Sum did not match");
			return false ; 
		}
		System.out.println("EACH AND EVERY DIAGNAL SUM THE SAME AT THIS POINT");
		
		return true;
	}

}
