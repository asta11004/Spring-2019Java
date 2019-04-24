package Task_Solutions;

public class Mylibraray {
	
	public static String reversestr1(String str) {
		String result2="";
		for(int i=str.length()-1; i >= 0 ;i--) {    
			 result2 =result2 + str.substring(i,i+1);
		}
		return result2;
		
	}
	

	public static String reversestr2(String str) {
		String result2="";
		for(int i=str.length()-1; i >= 0 ;i--) {    
			 result2 =result2 + str.charAt(i);
		}
		return result2;
	}
	
	


}
