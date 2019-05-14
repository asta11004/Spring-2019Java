package day44;

import java.util.Arrays;

public class MathActions {

	public static void main(String[] args) {
		
		
		MathEquasion math1=new MathEquasion(120, 10, '+');
		MathEquasion math2=new MathEquasion(13, 12, '-');
		MathEquasion math3=new MathEquasion(120, 10, '/');
		MathEquasion math4=new MathEquasion(12, 10, '*');

		System.out.println(math1.toString());
		math1.setOperator('*');
		math1.calculate();
		System.out.println(math1);
		
		
		//MathEquasion[] arr = new MathEquasion[] {math1,math2, math3, math4  }; 
		MathEquasion[] arr = {math1,math2, math3, math4  }; 
		
		for(MathEquasion each : arr) {
			each.calculate();
			System.out.println( each.getResult() );
			System.out.println(each);
		}
		
		for(MathEquasion each : arr) {
			each.calculate();
			System.out.println( each.getResult() );
			System.out.println(each);
		}
		
		System.out.println(Arrays.toString( arr) );
		

	}

}
