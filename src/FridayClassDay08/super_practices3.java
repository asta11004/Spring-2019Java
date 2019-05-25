package FridayClassDay08;

class data1{
	
	data1(){
		System.out.println("A");
	}
	data1(int a){
		System.out.println("B");
	}
	
}

public class super_practices3 extends data1 {
	public super_practices3() {
		System.out.println("C");
		
	}
	
	public super_practices3(int a) {
		System.out.println("D");
	}
	
	public static void main(String[] args) {
	//	new super_practices3();  // A C   reason: #11
		
	//	new super_practices3(9);   // A D
		
		new data1(100);
		
	}
	
}
