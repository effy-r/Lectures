class Internet {

	boolean hasInternet;
	double speed;
	
void getInternetSpeed() {

		String hasInternet1 = "has";
		String hasInternet2 = "hasn't";
		//double speed;

		if (hasInternet) {
			System.out.println("The user " + hasInternet1 + " internet.");
			System.out.println("The speed of users internet is " + speed);
		} else {
			System.out.println("The user " + hasInternet2 + "internet.");

		}
	}
}

public class example_task_methods {

	public static void main(String[] args) {

		Internet user1 = new Internet();
		user1.hasInternet=true;
		user1.speed=300;
		
		user1.getInternetSpeed();
		
		
	}

}
