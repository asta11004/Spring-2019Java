package day65;

public class DB_action {

public static void main(String[] args) {
		
		Singleton d1 =  Singleton.getInstance(); 
		Singleton d2 =  Singleton.getInstance(); 
		Singleton d3 =  Singleton.getInstance(); 
		Singleton d4 =  Singleton.getInstance(); 


		System.out.println( d1 == d2);
		System.out.println( d1 == d3);
		System.out.println( d1 == d4);
		
		
		
	}

}
