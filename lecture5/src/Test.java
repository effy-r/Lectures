import java.util.Scanner;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner userInput = new Scanner(System.in);

	        System.out.println("Enter your number");
	        if (userInput.hasNextInt()) {
	            int numberEntered = userInput.nextInt();
	            System.out.println("You entered an integer");
	        } else {
	            System.out.println("you didn't enter an integer");
	}
	        
	}

}
