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

		return "Weather forecast for next 7 days for " + getCountry() + " is "
				+ Arrays.toString(getDaysWeather());
	}

	private double getSumWeek() {
		double sum = 0;
		for (int i = 0; i < daysWeather.length; i++) {
			sum += daysWeather[i];
		}
		return sum;
	}

	public double getWeekAverage() {
		double average = getSumWeek() / getDaysWeather().length;
		return average;
	}

	public int getHottestTemperature() {
		return daysWeather[getHottestDayIndex()];
	}

	private int getHottestDayIndex() {

		int maxTemperature = daysWeather[0];
		int index = 0;
		for (int j = 0; j < daysWeather.length; j++)
			if (maxTemperature > daysWeather[j]) {
				continue;
			} else {
				maxTemperature = daysWeather[j];
				index = j;
			}
		return index;
	}

	public String getHottestDayName() {
		return getDay(getHottestDayIndex() + 1);
	}

	public String getColdestDayName() {
		return getDay(getColdestDayIndex() + 1);
	}

	public void printAdvancedInformation() {

		System.out.println(toString() + ";");
		System.out.println("the highest temperature will be on "
				+ getHottestDayName() + " " + getHottestTemperature()
				+ " degrees, " + "the lowest temperature will be on "
				+ getColdestDayName() + " " + getColdestTemperature()
				+ " degrees.");

	}

	public int getColdestTemperature() {
		return daysWeather[getColdestDayIndex()];

	}

	private int getColdestDayIndex() {
		int coldestTemperature = daysWeather[0];
		int index = 0;
		for (int k = 0; k < daysWeather.length; k++)
			if (coldestTemperature < daysWeather[k]) {
				continue;
			} else {
				coldestTemperature = daysWeather[k];
				index = k;

			}
		return index;

	}

	private String getDay(int index) {

		int hottestDay = getHottestDayIndex() + 1;
		String dayString = null;
		switch (index) {
		case 1:
			dayString = "Monday";
			break;
		case 2:
			dayString = "Tuesday";
			break;
		case 3:
			dayString = "Wednesday";
			break;
		case 4:
			dayString = "Thursday";
			break;
		case 5:
			dayString = "Friday";
			break;
		case 6:
			dayString = "Saturtday";
			break;
		case 7:
			dayString = "Sunday";
			break;
		}
		return dayString;
	}

	public void applyWarmCycloneEffect() {

		for (int i = 0; i < daysWeather.length; i++) {

			this.daysWeather[i] += 1;

		}

	}
	public static double celsiusToFahrenheit(double celsiusTemperature){
		double farenheitTemperature = (celsiusTemperature *1.8)+32;
		return farenheitTemperature;
		
	}
	
	
	}
	
	// Task 15 - We need that someone would provide to us weather forecast
			// for specific country
			// - create a static method which will create a 7 day forecast for
			// specific country
			// public static Weather getWeatherForecast(String countryName)
			// - google for random value generator, in order to fill day weather
			// with some values
			// Example:
			// Weather lithuania = Weather.getWeatherForecast("Lithuania");

}
