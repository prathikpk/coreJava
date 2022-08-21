package com.Aurionpro.model;

public class BMI {
	public Person person;
	public double BMI;

	public BMI(Person person) {
		this.person = person;
		this.BMI=CalculateBMI();
	}

	public double getBMI() {
		return BMI;
	}

	private double CalculateBMI() {
		double height = person.getHeight() / 100;
		BMI = person.getWeight() / (height * height);
		return BMI;
	}

	public String getBodyType() {
		if (BMI <= 18.5)
			return "under weight";
		if (BMI > 18.5 && BMI <= 24.9)
			return "Normal weight";
		if (BMI > 25)
			return "Overweight";
		return null;
	}

}
