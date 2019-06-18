package day50.diffPackage;

import day51.Animals;
import day52.Tiger;

public class Lion extends Tiger{
	
	public static void methodm() {
		
	}
	
	
	public void Test1() {
		Lion obj2 = new Lion();
		System.out.println(obj2.protectedtstr);
		methodm();
		
	}
	
	public static void main(String[] args) {
		new Lion().Test1();
		methodm();
		
	}
	
	// break:  4:45pm
	

}
