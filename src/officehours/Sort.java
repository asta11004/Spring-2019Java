package officehours;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		int[] nums = { 35, 543, 5, 54,65, 87, 65 };
		System.out.println(Arrays.toString(sortArray(nums)));
	}

	public static int[] sortArray(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
				i = 0;
			}
		}
		return arr;
	}
}
