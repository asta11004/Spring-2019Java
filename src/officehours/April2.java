package officehours;

import java.util.Scanner;

public class April2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    String sep = scan.next();
	    int count = scan.nextInt();
	    String summary = word;
	    while(--count>0){
	    	summary+=sep+word;
	    }
	    System.out.println(summary);	
	}
}
