package interview;

public class FinalizeMethod {

	// finalize is a method from Object class 
	// it's meant to run right before object is 
	//actually garbage collected 
	// and it's highly discourage to use 
	// for actual logic before object being destroyed
	// because there is no guarantee the method 
	// will run since we can not guarantee when 
	// garbage collection will happen 
	
	
	public static void main(String[] args) {
		
		System.out.println("THE START ");
		
		FinalizeMethod f1 = new FinalizeMethod(); 
		f1 = null ; 
		
		System.out.println("THE END ");
		System.out.println("THE END ");
		System.out.println("THE END ");
		System.out.println("THE END ");

	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("OBJECT CLASS "
			+ "finalize method being overriden");
	}

}
