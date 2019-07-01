package interview;

public class ReverseThinking_isMagic2 {

	public static void main(String[] args) {

		int[][] data = {
							{ 3, 3, 3 }, 
							{ 3, 3, 3 }, 
							{ 3, 3, 3 } 
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

			if (each1DArray.length != itemCount)
				return false;

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
			for (int col = 0; col < itemCount; col++) {
				
				rowSum +=   twoDArr[k][col] ; 
				
			}
			
			if(targetSum!= rowSum) {
				System.out.println((k+1) + " ROW SUM DID NOT MATCH");
				return false ; 
			}
			System.out.println((k+1) + "MATCH :  row Sum is " + rowSum);

			
			
			int colSum = 0 ; 
			for (int row = 0; row < itemCount; row++) {
				colSum +=  twoDArr[row][k] ; 
			}
			
			if(targetSum!= colSum) {
				System.out.println((k+1) + " COL SUM DID NOT MATCH");
				return false ; 
			}
			System.out.println((k+1) + "MATCH :  COL Sum is " + colSum);

			
			diagnalSum  +=   twoDArr[k][k] ; 
			diagnalSumR +=   twoDArr[k][lastIndex - k] ; 

			
		}

		System.out.println("diagnal Sum 1 " + diagnalSum);
		System.out.println("diagnal Sum 2 " + diagnalSumR);
		
		if(targetSum!= diagnalSum || targetSum!= diagnalSumR) {
			return false ; 
		}
		System.out.println("EACH AND EVERY DIAGNAL SUM THE SAME AT THIS POINT");
		
		return true;
	}

}
