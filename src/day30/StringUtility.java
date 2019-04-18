package day30;

public class StringUtility {

	public static void main(String[] args) {
	
		reverseString("abc");  //-->> print out cba
		reverseString("Orville");  //-->> print out cba
		reverseString("Java");  //-->> print out cba
		reverseString("WestWorld");  //-->> print out cba

	}
	
	public static void reverseString(String str) {
		
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
	}

}
