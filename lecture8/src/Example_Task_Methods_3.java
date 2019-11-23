class Car {
	private String brand;
	private int maxSpeed;
	private String colour;

	public void setBrand(String brand1) {
		brand = brand1;
	}
	// so you set a new variable, that you will change/set in public static void

	public String getBrand() {
		return this.brand;
	}

	public void setMaxSpeed(int maxSpeed1) {
		maxSpeed = maxSpeed1;
	}

	int getMaxSpeed() {
		return maxSpeed;
		// System.out.println("The maxSpeed is " +maxSpeed);
	}

	public void setColour(String colour1) {
		colour = colour1;
	}

	String getcolour() {
		return colour;
	}

}

public class Example_Task_Methods_3 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car audi = new Car();

		// audi.brand = "audi";
		// audi.colour = "blue";
		// audi.maxSpeed = 300;
		audi.setBrand("audi a1 ");
		audi.setColour("blue");
		audi.setMaxSpeed(300);

		System.out.println("I drive a " + audi.getcolour() + " "
				+ audi.getBrand() + " with the maximum speed "
				+ audi.getMaxSpeed() + "km/h.");

		// System.out.println(getBrand() + getcolour() +getmaxSpeed());
	}

}
