package officehours;

import java.util.Arrays;

public class April10 {
	public static void main(String[] args) {
//		String[] fruits = {"Apple", "Orange", "Kiwi", 
//							"Watermelon", "Dragon fruit", "Grape",
//							"Pear", "Peach", "Mango", "Banana"};

//		reverse numbers
		int[] numbers = { 11, 2, 39, 4, 15, 1 };
		int temp = 0;
		//we have for loop with 2 variables
		//basically, variable i will start from the beginning 
		//variable j will start from the end
		//and, we will take values one by one for swap
		//in the first iteration i will have value of 11
		// and j will have value of 15
		//we are iterating until we reach the middle of array 
		//i < numbers.length / 2 <-- it returns number of elements/2   
		for (int i = 0, j = numbers.length - 1; i < numbers.length / 2; i++, j--) {
			//so temp variable will store value of first element
			temp = numbers[i];
			//we are assigning value of last element to the first element
			numbers[i] = numbers[j];
			//then, we are assigning value of first element (that is inside variable temp)
			//to the last element
			numbers[j] = temp;
		}
		//System.out.println(Arrays.toString(numbers));
		String email = "myfancy@email.com";
	    
	    //Write your code below
		if(email.contains("@")) {
		    String[] arr = email.split("@");
		    if(arr.length==2){
		      System.out.println("Email id: "+arr[0]);
		      System.out.println("Email domain: "+arr[1]);
		    }else{
		      System.out.println("invalid email");
		    }
		}else {
			System.out.println("invalid email");
		}
	}
}
