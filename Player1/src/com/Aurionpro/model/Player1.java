package com.Aurionpro.model;

public class Player1 {

	public String id;
	public String name;
	public int age;
	public static int count = 101;

	public Player1(String name, int age) {
		this.id = generateId();
		this.name = name;
		this.age = age;
	}

	private String generateId() {
		return "P"+count++;
	}

	public Player1(String name) {
		this.id = generateId();
		this.name = name;
		this.age = 49;
	}

	public Player1() {
		this("Rohit", 59);
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String whoIselder(Player1 elder) {
		if (age > elder.age) {
			return this.name;
		}
		if (age < elder.age) {
			return elder.name;
		}
		return null;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
