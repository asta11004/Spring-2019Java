package officehours;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		int[] nums = { 35, 543, 5, 54, 65, 87, 65 };
		System.out.println(Arrays.toString(sortArray(nums)));
	}

	public static int[] sortArray(int[] arr) {
		// loop through the array
		int i=0;
		while(i < arr.length-1) {
			// if next value is less than previous
			// swap them
			if (arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				// reset index to start from the beginning
				i = 0;
			}
			i++;
		}
		return arr;
	}
}
