package FridayClassDay10;

abstract class class1{
	
//	public abstract static void absmethod(); // abstarct method can't be static, beacsue it's meant to be override
	
//	 private abstract void method();   // private will not allow method to be override, and abstract method is meant to be override
	
//	  final abstract void method2();  // final method cannot be override, and abstract method is meant to be override
	
	
	abstract void method3();
	
	// 	void method4();   in order to create abstract methods in abstract class, you MUST give abstract keyword
	
	
}



public abstract class AbstractionNotes extends class1{
	
	int z=10;
	
	
	
//	abstract void method3();
	
	
//	@Override
//	public void method3() {
//		
//	}
	
	
	/*
	 declaration of abstract method:
	 		abstract  AM   return-type  methodname(parameter);
	 
	 */
	
//	abstract public void absmethod();  // abstarct method can only be declared in abstract class or in an interface

	
	// 10 minutes break. 

}


class class2 extends  AbstractionNotes{

	@Override
	void method3() {
			
	} 
	
	
	
}






