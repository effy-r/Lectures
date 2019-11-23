import java.util.Arrays;
import java.util.Scanner;

public class tasks_arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Write a program that fills a 10-element array with numbers from 0 to
		 * 9, using loop
		 */

		// int[] numbers;

		// var rakstiit shadi:
		// int [] numbers = {1,2,3,4,5,6,7,8,9,10};

		int[] numbers = new int[10];

		// int i = numbers[0];

		for (int i = numbers[0]; i < numbers.length; i++) {

			System.out.println(i);
		}

		/*
		 * Write a program which will return day name based on dayIndex using
		 * array. User should be informed if he has entered incorrect index.
		 */

		Scanner dayIndex = new Scanner(System.in);
		int a = dayIndex.nextInt();
		System.out.println("Please choose the day:");

		String[] dayIndex1 = { "Monday", "Tuesday", "Wednesday", "Thursday",
				"Friday", "Saturtday", "Sunday" };

		// System.out.println(dayIndex1[a-1]);

		if (a > 7) {
			System.out.println("Choose a day from 1 to 7!");
		} else {
			System.out.println(dayIndex1[a - 1]);
		}

		/*
		 * Write a program that fills a 10-element array with numbers from 9 to
		 * 0, using loop
		 */

		int array[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

		for (int d = 1; d < array.length; d++) {
			System.out.println(array[d]);
		}

		/*
		 * Write a program to sum values of an array int[] myArray = { 1, -3,
		 * 44, -39};
		 */

		int[] myArray = { 1, -3, 44, -39 };
		int sum = 0;

		for (int e : myArray)
			sum += e;

		System.out.println("The sum is:" + sum);
		
		/*
		 * Write a program to evaluate if an array contains a value entered by
		 * user. Test data int[] myArray = { 11, 22, 33, 44, 55, 66, 77, 88,
		 * 99}; User input 22. Output: number 22 is inside of an array.
		 */

		int[] myArray1 = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };

		Scanner input2 = new Scanner(System.in);
		System.out.println("Please write the number:");
		int g = input2.nextInt();
		for (int f = 0; f < myArray1.length; f++) {
			if (g == myArray1[f]) {
				System.out.println("number " + g + "is inside of an array");
			} else {
				System.out.println("Numebr is not in the array!");
				break;
			}

		}
		/*Write a Java program to reverse an array of integer values.
		➢int[] myArray = { 11, 22, 33, 44, 55, 66, 77, 88, 99}; -> 99,88,...,11
		➢Take a look into Arrays.toString(array)*/
		
		}
		
		
		
	}

