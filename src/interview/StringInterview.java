package interview;

public class StringInterview {

	public static void main(String[] args) {
		
		
        String ta = "A "; 
        String ta1 ="A "; 
        String ta2 ="A ";  
		String ta3 = new String("A ");  
        String ta4 = ta2.concat("");  
        
        System.out.println( ta == ta1   );
        System.out.println( ta == ta3   );
        System.out.println( ta2 == ta4   );
        System.out.println( ta3 == ta4   );

        
	}

}
