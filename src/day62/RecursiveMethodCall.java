package day62;

public class RecursiveMethodCall {

	public static void main(String[] args) {
		
		callYou();
		System.out.println("End");
		
		
	}

	public static void callMe() {
		
		callYou();
		
	}

	public static void callYou() {
		
		callMe();
		
	}

}
