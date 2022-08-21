package com.Aurionpro.model;

public class Person {
	public String name;
	public int age;
	public float height;
	public float weight;
	public GenderOption gender;

	public Person(String name,int age, float height, float weight, GenderOption gender) {
		super();
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.name=name;
	}

	public int getAge() {
		return age;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public GenderOption getGender() {
		return gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + ", gender="
				+ gender + "]";
	}

	

}
