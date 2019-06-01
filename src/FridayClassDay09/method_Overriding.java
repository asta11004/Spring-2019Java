package FridayClassDay09;

class class1{
	
	public  void method1() {
		System.out.println("Original");
	}
	
	private void method2() {
		
	}
	
	public final void method3() {
		
	}
	
	protected void method4() {
		
	}
	
	void method5() {
		
	}
}

public class method_Overriding extends class1 {
	/*
	 override methods:  only instance method can be override ( cannot have private access modfier, and cannot be final)
	 		instance methods from super class is being override in the sub class.
	 		
	 		
	 
	 */
	
	@Override  // it checks if the method is overide method
	public void method1() {
		System.out.println("customized");
	}
	
//	@Override
//	private void method2() {    }    // the access modifier is private
	
//	public final void method3() {   }   // final methods cannot be override.
	
		@Override
		public void method4() {
				
			}
		
		
		@Override
		public void method5() {
			
		}
		
		
		//next reveiw section:  imports, imprt static, override Vs overload, StringBuilder, StringBuffer
		
	

}
