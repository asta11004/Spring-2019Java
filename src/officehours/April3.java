package officehours;

import java.util.Scanner;

public class April3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char start = scan.next().charAt(0);
		char end = scan.next().charAt(0);
		while (end >= start) {	
			System.out.println((Character.getType(end))+" : "+end);
			end--;
		}
	}
}
