import java.util.Arrays;
import java.util.Scanner;

public class reversing_array_values {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myArray = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };

		/*
		 * Write a Java program to reverse an array of integer values. ➢int[]
		 * myArray = { 11, 22, 33, 44, 55, 66, 77, 88, 99}; -> 99,88,...,11
		 * ➢Take a look into Arrays.toString(array)
		 */

		// System.out.println(Arrays.toString(myArray));
		// int a = myArray.length;
		// System.out.println(a);
		
		//i = ir garums; 

		for (int i=myArray.length; i>=0; i--){
			System.out.println(i);
			
			int e = myArray[i];
			System.out.println(e);
			
			int[] myArray1 = {e};
			
			
			System.out.println(Arrays.toString(myArray1));
			
		}
		System.out.println(Arrays.toString(myArray));
	}

}
