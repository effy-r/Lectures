package com.accenture.lecture15;

import java.util.Arrays;

public class Weather {

	// defined instances
	private final String country;
	// days Weather stores information for the next week
	private int[] daysWeather;

	// this is a constructor, which names the country and uses the array
	Weather(String country, int[] daysWeather) {
		this.country = country;
		this.daysWeather = daysWeather;

	}

	String getCountry() {
		return this.country;
	}

	int[] getDaysWeather() {
		return daysWeather;
	}

	public String toString() {
		
		return "Weather forecast for next 7 days for " + getCountry() + " is " + Arrays.toString(getDaysWeather());

	}

	public void toString456() {
		System.out.print("Weather forecast for next 7 days for " + getCountry()
				+ " is ");
		for (int i = 0; i <= daysWeather.length; i++) {
			if (i < 6) {
				System.out.print(daysWeather[i]);
				System.out.print(", ");

			} else
			System.out.print(daysWeather[i]);
			System.out.print(".");

		}

	}

	// Task 6 - User should be able to get weather information in
	// user-friendly way
	// Create toString method in Weather class
	// Output:
	// "Weather forecast in 'Latvia' for next days '-2, 0, 5, 2, 6, -1, 0'"
	// System.out.println(latvia);

}
