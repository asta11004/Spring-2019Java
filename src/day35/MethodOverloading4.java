package day35;

public class MethodOverloading4 {

	public static void main(String[] args) {
	
		// ANY literal non-fractional numbers will be seen as int 
		// ANY literal fractional numbers will be seen as double 		
//		double d ; 
//		
//		d = 10 ; 
//		System.out.println(d);
//		d = 10L ; 
//		System.out.println(d);
//		d = 10F ; 
//		System.out.println(d);
		
//		float f = 15/2.0 ; 
		
		release((byte)10); 
		release((short)10); 
		release(10); 
		release(10L); 
		release(10F); 
//		release(10d);
//		release(10.5);
		release(15/2); //7 int  
//		release(15/2.0);// 7.5 double 
		release(15/2.0F);// 7.5 float 
		

	}
	
	public static void release(float f) {
		System.out.println("float "+ f);
	}	
//	public static void release(double d) {
//		System.out.println("double "+ d);
//	}
	
	public static void release(int d) {
		System.out.println("int "+ d);
	}
	
	
	
	
	
	// this method can take any argument of type int 
	// or anything that can be stored inside int variable 
	// for example short and bytes are allowed 
	// but not long or double 
	
	

}
