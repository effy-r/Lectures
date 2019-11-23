import java.util.Arrays;

public class sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a Java program to reverse an array of integer values. ➢int[]
		 * myArray = { 11, 22, 33, 44, 55, 66, 77, 88, 99}; -> 99,88,...,11
		 * ➢Take a look into Arrays.toString(array)
		 */

		// Solution 1

		int[] array = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		int a = array.length;
		for (int i = 0; i <= a / 2; i++) {

			int h = array[i];
			array[i] = array[array.length - i - 1];
			array[a - i - 1] = h;

		}
		System.out.print(Arrays.toString(array));
		
		//Solution 2
		
		
	}

}
