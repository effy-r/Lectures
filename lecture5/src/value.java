import java.util.Scanner;


public class value {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		/*Scanner number1 = new Scanner(System.in);
		
		System.out.println("Enter number:");
		
		
		float number2 = number1.nextFloat();
		
		if (number2>0){
		System.out.println("Number is positive:" + number2);
		}
		else {
		System.out.println("Number is negative:" + number2);
	
		}*/
		
Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter number:");
		
		int numberEntered = userInput.nextInt();
		if (userInput.hasNextInt()){
			//int numberEntered = userInput.nextInt();
			System.out.println("enter number");
		}
		else {
			System.out.println("you didn't enter an integer");
		
		
		}
	
		}
	}


