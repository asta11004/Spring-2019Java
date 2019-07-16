package interview;

public class FinalFinallyFinalize {

	public static void main(String[] args) {
		
		/**
		 * Final class 		-->> no class
		 * Final method 	-->> can not be overridden
		 * Final Variable 	-->> can not be reassigned 
		 */
		
		System.out.println("Beginning ");
		
		try {
			System.out.println("TRY BLOCK ");
			//System.exit(0);
			throw new ArithmeticException("DIVIDE BY 0 ") ; 
		} catch (NullPointerException e) {
			System.out.println("CATCH BLOCK ");
		} finally {
			System.out.println("FINALLY BLOCK ");
			// RuntimeException will suppress ArithmeticException
			// and only RuntimeException will be displayed on consule 
			throw new RuntimeException("finally throw ") ; 
		}
		//System.out.println("Ending "); 
		

	}

}
