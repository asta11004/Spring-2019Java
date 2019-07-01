package interview;

public class ReplTask_isSquare {
	
	
	public static boolean isSquare(int[][] twoDArr) {		
		/// CHECK ONE THING THAT DOES NOT MEET THE REQUIREMENT 
			// IF SO RETURN FALSE 
		int twoDArrItemCount = twoDArr.length ; 
		for (int[] each1DArray : twoDArr) {
			
			if( each1DArray.length !=  twoDArrItemCount )
				return false ; 
			
		}
		System.out.println(" THIS IS A SQUARE ! DID NOT FIND NO MATCH !!!");
		return true ; 
	}
	
	public static void main(String[] args) {
		// two dimensional array store one dimensional array as per item 
	  int[][] data = {  
			  			{1,4} , 
			  			{8,9}  
			  		} ; 
	  isSquare(data) ; 
	
	}

}
