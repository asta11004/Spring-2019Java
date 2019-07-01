package interview;

public class ReverseThinking {

	public static void main(String[] args) {
		

		int[] arr = {1110,3,4,5,1000,40000} ; 
		System.out.println( isMoreThan100(arr)  );
		
	}
	
	// task create a method to check whether all of your array items is more than 100
	// return true if so , false if not 
	public static boolean isMoreThan100( int[] nums ) {
		
		for (int each : nums) {
			if(each<= 100) {
				return false ; 
			}
		}
		
		return true ; 
	}
	

}
