package interview;

public class EatingYourException {

	public static void main(String[] args) {
		
		try {
			System.out.println("try block ");
			throw new RuntimeException(); 
			
		} catch (Exception e) {
			// eating the exception , swallow the exception 
			// VERY BAD IDEA , DO NOT DO IT !!! 
		}
		

	}

}
