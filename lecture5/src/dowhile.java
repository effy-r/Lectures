import java.util.Scanner;


public class dowhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int value = 0;
		
		do {
			System.out.println("Enter number:");
			value = input.nextInt();
		}
		while (value !=5);
		
		System.out.println("Got 5!");
		}
	}


