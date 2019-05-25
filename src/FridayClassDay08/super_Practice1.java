package FridayClassDay08;

class Animal  {
	
	Animal(){
		System.out.println("Animal");
	}
	
	
	
}

public class super_Practice1 extends Animal {
//             child (sub)	         parent( super)

	public super_Practice1( ) {
	
		System.out.println("tiger");	
	}
	
	
	public static void main(String[] args) {
		
		new super_Practice1();  // reason: #11
		
	}
	
	
}
