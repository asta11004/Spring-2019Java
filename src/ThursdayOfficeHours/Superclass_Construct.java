package ThursdayOfficeHours;


// rule #11
class A1 {
	
	A1(){
		System.out.println("A");
	}
	
}




public class Superclass_Construct  extends A1 {
//				child                     parent class
	
	Superclass_Construct( int a ){
		
		System.out.println("B");
	}
	
	
	public static void main(String[] args) {
		new Superclass_Construct(9);   // A B  reason: #11  
				
	}
	
	
}
