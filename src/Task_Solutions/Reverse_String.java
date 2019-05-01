package Task_Solutions;

public class Reverse_String {
	public static void main(String[] args) {
		String str = "Cybertek";   // expected result ==> DCBA
		//  index     0123                            3210  
		
		String RevStr = "";
		
		for(int i = str.length()-1; i >= 0 ; i--) {
				// RevStr += str.charAt(i);
			RevStr += str.substring(i,i+1);
		}
		
		System.out.println(RevStr);
		
		
	}

}
