package FridayClassDaY11;

public class EXCEPTIONS {
	public static void main(String[] args) {
		
		/*
		 	Today's topic:
		 			1. Exceptions
		 			2. Exception handling
		 			3. try&catch VS throws VS throw
		 			
		 	Exceptions: 
		 	
		 	Exception class is the parent class of all the checked and unchecked exceptions
		 	RuTimeException class is the parent class of all the unchecked exceptions.
		 	
		 		1. checked Exceptions (unwanted): occurs during compile time. needs to be handled immediately
		 							( because it gives you compile error)
		 		
		 		2. Unchecked Exceptions (unexpected ): is called RuntimeException .
		 					unchecked exceptions are runtime exception, only occurs during the runtime
		
		 	
		 	
		 	
		 */
		
		// Ex: unchecked Exceptions ( Unexpected ): Runtime Exceptions
		
				int[] arr= { 1, 2 } ;
				
				System.out.println( arr[100] );  // unchekced
				
			
		//Ex: Checked exception ( unwanted ): compile time, given compile error
				
				//	Thread.sleep(3000);
				
		
		// Error is not compile error
		
		
	}

}
