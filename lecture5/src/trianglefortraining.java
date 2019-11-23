import java.util.Scanner;


public class trianglefortraining {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a program which display the pattern like right angle triangle with a number. Example for user input : 6
		1
		22
		333
		4444
		55555
		666666*/
		
		
		int b;
		int c;
		Scanner input = new Scanner(System.in);
		System.out.println("Please choose a number:");
		int a= input.nextInt();
		
		
		for (b=1; b<=a; b++){
			for (c=1; c<=b; c++){
				System.out.print(b);
			}
				System.out.println(b);
			}
			
			
		}
	}

