package day50.diffPackage;

import Day52.Tiger;
import day51.Animals;

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
