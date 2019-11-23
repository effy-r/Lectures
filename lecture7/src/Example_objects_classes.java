import java.util.Scanner;

class User {
	// fileds
	String name;
	int age;
	boolean man;
	String colour;
	public void writeYourName() {
		System.out.print("Would you repeat your name, " + name);
		// TODO Auto-generated method stub
		
	}
}

public class Example_objects_classes {
	/**
	 * @param args
	 */

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String name = "Peter";
		// int age = 21;
		// boolean man = false; String name1 = "Anna";
		// int age2 = 22;
		// boolean man2 = true;
		
		
		User peter = new User();
		peter.name = "Peter";
		peter.age = 21;
		peter.man = true;
		peter.writeYourName();

		System.out.println("Hi, my name is " + peter.name + " I'm " + peter.age
				+ " old");
		User anna = new User();
		anna.name = "Anna";
		anna.age = 20;
		anna.man = false;
		anna.colour = "black";
		System.out.println("Hi, my name is " + anna.name + " I'm " + anna.age
				+ " old" + anna.colour);
		
		System.out.println("Please write your user name:");
		Scanner userinput = new Scanner(System.in);
		String username = userinput.next();
		
		User mark = new User();
		mark.name = username;
		
		System.out.print("Hi, my name is " + mark.name +" Bye!");

	}
}