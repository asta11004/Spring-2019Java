package Task_Solutions;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		String str="ABCD";      //    ==> DCBA
	//  index       0123                  3210
		
	boolean b=	str.length()-1 ==3;
	System.out.println(b);
		// charAt & SubString.
		
		// charAt(index):
		
		String str2=""+str.charAt(3) + str.charAt(2) + str.charAt(1) + str.charAt(0) ;
		System.out.println(str2);
		
		//solution 1: 
		String str3="";
		for(int i=str.length()-1; i >=0 ; i--) {  //   3   2   1  0
			str3= str3 + str.charAt(i);
		}
		System.out.println(str3);
		

		
		// substring(beginning index, ending index).
			str="ABCD";    //  ==> DCBA
		// index:0123 
			
		String letterD= str.substring(3,3+1);
		//  System.out.println(letterD);
		
		String result1 = ""+str.substring(3,3+1) + str.substring(2,2+1)
					+str.substring(1,1+1)+str.substring(0,0+1);
		System.out.println(result1);
		
		
		// Solution 2:
		String result2="";
		for(int i=str.length()-1; i >= 0 ;i--) {    // 3    2    1   0
			 result2 =result2 + str.substring(i,i+1);
		}
		System.out.println(result2);   
		
		
			String results1 =	reversestr1("Muhtar");
			
				String  results2 = reversestr2("Muhtar") ;
		
		System.out.println(results1);
		System.out.println(results2);
		
		
	 // 	Arrays.sort();
		
		String StrB="cybertek batch 11";
		
		   String strb1= Mylibraray.reversestr1(StrB);
		   System.out.println(strb1);
		
		
		
		
		
		
		
		
		
		
	}

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
