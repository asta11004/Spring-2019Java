package officehours;

import java.util.Arrays;
import java.util.Scanner;

public class April24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int decimal = input.nextInt();
		int[] binary = new int[8];

		// TODO: Write your code below.
		// we are getting array of chars with binary representation of number
		// Integer.toBinaryString(decimal) converts any number into binary
		// .toCharArray(); this method converts anything into array of characters
//		char[] binaryChar = Integer.toBinaryString(decimal).toCharArray();
//		for (int i = binary.length - 1, j = binaryChar.length - 1; j >= 0; j--, i--) {
//			//Character.getNumericValue will return number not unicode
//			binary[i] = Character.getNumericValue(binaryChar[j]);
//		}
		for (int i = binary.length - 1; i >= 0; i--) {
			binary[i] = decimal % 2;
			decimal /= 2;

		}

		System.out.println(Arrays.toString(binary));
		System.out.println(Long.MIN_VALUE);

	}
}
