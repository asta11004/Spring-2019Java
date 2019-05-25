package FridayClassDay08;

class B1{
	
	B1(){
		System.out.println("Parent' deafult constructor");
	}

	B1(int a){
		
	}
	
}


public class super_practices2 extends   B1        {
//				child                 parent class	
	super_practices2(){
	//	super( 1000 );  // we have to call   Reason: #12
		
	}
	
	public static void main(String[] args) {
		new super_practices2();
	}
	

}
