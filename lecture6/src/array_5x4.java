import java.util.Arrays;
import java.util.Scanner;

public class array_5x4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] array = new int[5][4];

	
		Scanner row = new Scanner(System.in);
		System.out.println("Enter row:");
		int a = row.nextInt();
		Scanner col = new Scanner(System.in);
		System.out.println("Enter col:");
		int b = col.nextInt();
		Scanner value = new Scanner(System.in);
		System.out.println("Enter value:");
		int c = value.nextInt();

		array[b-1][a-1]= c;
		// System.out.print(array[1][1]);
		
		for (int i = 0; i < 4; i++) {
			// i ir rindas --> shis loops uztaisa mums array
			for (int j = 0; j <5 ; j++) {
				System.out.print("" + array[j][i] + ",");
				//j ir kolonnas
			}
			System.out.println();
			System.out.println(Arrays.toString(array));

			/*
			 * System.out.println(""+ array[a][b]+",");
			 * 
			 * System.out.println(Arrays.toString(array));
			 * System.out.println(Arrays.toString(array));
			 */

		}

	}
}
