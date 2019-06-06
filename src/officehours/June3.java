package officehours;

import java.util.ArrayList;

public class June3 {
	public static void main(String[] args) {
		int primitive = 1; // this is a primitive, list.remove(a) treats this variable as a position
							// (index),
		// not like a value
		Integer object = 1;// this is an object
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(2);
		list.add(1);
		System.out.println("Removing based on primitive int: " + list.remove(primitive));
		System.out.println("Removing based on object of Integer: " + list.remove(object));
		System.out.println("Remaining values: " + list);
		list.size();
		list.contains(1);
		list.isEmpty();
		// * Comment */
		// Comment
		/* Comment */

		char A = 'd';
		int a = 213;
		long b = 1231231231;

		Numbers(A);
		Numbers(a);
		Numbers(b);
		// for integers, int is a default data type. For floats - double is a default
		// data type.
		int num = (int) 20L;
//		int  num2 = 20L ;
		appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old.");
	}

	public static void Numbers(int num1) {
		System.out.println("int number: " + num1);
	}

	public static void Numbers(double num1) {
		System.out.println("double number: " + num1);
	}

	public static void Numbers(short num1) {
		System.out.println("short number: " + num1);
	}

	public static boolean appearsTwice(String target, String sentence) {
		int counter = 0;
		for (int i = 0; i <= sentence.length() - target.length(); i++) {
			String temp = sentence.substring(i, i + target.length());
			System.out.println(i + " : " + temp);
			if (temp.equals(target)) {
				counter++;
			}
		}
		return counter == 2;
	}
}
