import java.util.Scanner;


public class Nameofday {

	
	public static void main(String[] args) {
		
		
	
		
	
		int Monday=1;
		int Tuesday=2;
		int Wednesday=3;
		int Thursday=4;
		int Friday=5;
		int Saturtday=6;
		int Sunday=7;
		
		Scanner myObj = new Scanner (System.in);
		System.out.println("Please enter the day of the week:");
		
		int dayIndex1=myObj.nextInt();
		
//		System.out.println("You chose:" + day);
		
		if(dayIndex1==Monday) {
			System.out.println("Monday");
		}
		else if (dayIndex1==Tuesday) {System.out.println("Tuesday");
		
		}
		else if (dayIndex1==Wednesday) {System.out.println("Wednesday");
		
		}
		else if (dayIndex1==Thursday) {System.out.println("Thursday");
		
		}
		else if (dayIndex1==Friday) {System.out.println("Friday");

		}
		else if (dayIndex1==Saturtday) {System.out.println("Saturtday");
		}
		else if (dayIndex1==Sunday) {System.out.println("Sunday");
		}
		else {System.out.println("You have chosen non-existing day. Please choose fromdays of the week.");
		}
	}

}
