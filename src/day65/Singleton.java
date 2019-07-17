package day65;

public class Singleton {

	
	private static Singleton instance ; 
	
	private Singleton() {
	}
	
	
	public static Singleton getInstance(){
		
		if(instance == null) {
		
			System.out.println("get instance being called ");
			instance = new Singleton(); 
		
		} else {
			System.out.println("YOU ALREADY HAVE OBJECT, USE IT !!");
		}
		
		return instance ; 
		
	}
	
	
	
}
