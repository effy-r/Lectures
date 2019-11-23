package com.accenture.lecture15;

import java.util.Arrays;

public class Weather {

	// defined instances
	private final String country;
	// days Weather stores information for the next week
	private int[] daysWeather;

	// this is a constructor, which names the country and uses the array
	public Weather(String country, int[] daysWeather) {
		this.country = country;
		this.daysWeather = daysWeather;

	}

	public String getCountry() {
		return this.country;
	}

	public int[] getDaysWeather() {
		return daysWeather;
	}

	public String toString() {
		
		return "Weather forecast for next 7 days for " + getCountry() + " is " + Arrays.toString(getDaysWeather());

	}



	}



