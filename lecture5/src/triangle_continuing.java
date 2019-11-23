import java.util.Scanner;


public class triangle_continuing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program which display the pattern like right angle triangle
		 * with a number. Input number of rows : 6 1 12 123 1234 12345 123456
		 */
		
		int b;
		int c;
		Scanner input = new Scanner(System.in);
		System.out.println("Please choose a number:");
		int a= input.nextInt();
		
		
		for (b=1; b<=a; b++){
			for (c=1; c<=b; c++){
				System.out.print(c);
			}
				System.out.println(c);
			}
			
			
		}
	}