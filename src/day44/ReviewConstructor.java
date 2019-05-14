package day44; 

public class ReviewConstructor {

	
//	public void ReviewConstructor() {
//	
//		System.out.println("BOOM ");
//		
//	}
	// we can use any access modifer for constructor 
	public ReviewConstructor(String abc) {
		System.out.println("BOOM REAL " + abc);
	}
	
	
	public static void main(String[] args) {
		
		// does not compile -- there is no no-arg constructor defined 
		// ReviewConstructor re = new ReviewConstructor(); 
		
	}

}
