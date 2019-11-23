class DrivingRule {
	private final String name;
	private String description;
	private static String country = "Latvia";
	private int maxSpeed;

	static final int MAX_SPEED_CITY = 50;
	private static final int MAX_SPEED_OUTSIDE = 90;

	private static int totalRules;
	private static String light;
	private static int pedestrian;

	public DrivingRule(String name, String description) {
		this.name = name;
		this.description = description;
		totalRules++;
		if (totalRules == 1) {
			System.out.println("Together there is " + totalRules
					+ " driving rule.");
		} else {

			System.out.println("Together there are " + totalRules
					+ " driving rules.");
		}
	}

	public void city() {

		maxSpeed = MAX_SPEED_CITY;
		System.out.println("Your allowed max speed is " + maxSpeed + " kmph.");
	}

	public void countrySide() {
		maxSpeed = MAX_SPEED_OUTSIDE;
		System.out.println("Your allowed max speed is " + maxSpeed + " kmph.");
	}

	public void trafficLight() {
		if (light == "red") {
			System.out.println("The traffic light is red, you have to wait!");
		} else {
			System.out.println("The traffic light is green. You can go!");
		}

	}

	String gettrafficLight() {
		return light;
	}

	String settrafficLight(String light1) {
		return light = light1;
	}

	public void pedestrian() {
		if (pedestrian == 1) {
			System.out
					.println("You have to wait till the pedestrian crosses the pedestrian crossing!");
		} else {
			System.out.println("Continue to drive - no pedestrians here!");
		}
	}

	int setPedestrian(int pedestrian) {
		return this.pedestrian = pedestrian;
	}

	int getPedestrian() {
		return pedestrian;
	}
}

public class Examples_Lecture10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DrivingRule rule1 = new DrivingRule("City", "You are in the city.");
		rule1.city();
		
		DrivingRule rule2 = new DrivingRule("Outside the city",
				"This is countryside.");
		rule2.countrySide();

		DrivingRule rule3 = new DrivingRule("Traffic lights",
				"You can't drive past the red light.");
		rule3.settrafficLight("red");
		// rule3.gettrafficLight();
		rule3.trafficLight();
		DrivingRule rule4 = new DrivingRule("Pedestrians",
				"You can't hit pedestrians.");
		rule4.setPedestrian(1);
		rule4.getPedestrian();
		rule4.pedestrian();
	}
}
