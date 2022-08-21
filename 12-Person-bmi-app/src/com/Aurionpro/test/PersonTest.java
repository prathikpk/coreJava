package com.Aurionpro.test;

import com.Aurionpro.model.BMI;
import com.Aurionpro.model.GenderOption;
import com.Aurionpro.model.Person;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("prathik", 20, 150, 50, GenderOption.MALE);
		BMI bmi = new BMI(p1);
		System.out.println(p1);
		System.out.println("BMI: " + bmi.getBMI());
		System.out.println("Bodytype: " + bmi.getBodyType());

	}

}
