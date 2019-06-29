package FridayClassDaY11;

public class notes {
	/*
	 
	 Exception: the parent class of all the checked and unchecked exceptions classes 
	 
		there are two kinds of exceptions: 
				1. checked (unwanted): occurs in compile time (will give compile error)
									needs to be handled immediately.									
				
				2. unchecked (unexpected): occurs during run time.
									compiler is unable to detect, only occurs during runtime
									RuntimeException is the parent class of all the unchecked exceptions' classes 							 											
	 
	 
	 	Exceptions can be handled by using try&catch blocks and throws keyword
	 			
	 			1. try& catch blocks: only one of the blocks gets executed.
		 					 try block: only executed if there is no unchecked exception
		 					 catch block: only executed when if there is unchecked exception
		 					
	 					1. one try block can have multiple catch blocks:
	 				
	 						if there are more multiple catch blocks, the catch blocks arguments ( or exception classes needs
	 						to be in Ascending order ( from child class to the parent). 
	 						CAN NOT be in Descending ( from parent to child) order, and cannot be duplicated
	 						
	 					
	 			2. throws: used with the method signature, 
	 						indicates that method throws an exception.
	 						if the method with throws signature is being called by another method, 
	 						then the caller will have to handle the exception.
	 						
	 						
	 			3. throw: used to create instance of an exception.
	 			 				(creates the object of the exceptions' classes)
	 			 				Must be declared within the methods or blocks
	 
	 */

}
