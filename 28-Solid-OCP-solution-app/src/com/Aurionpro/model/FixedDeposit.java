package com.Aurionpro.model;

public class FixedDeposit {
	public String name;
	public double principal;
	public int duration;
	public IInterest festinterest;

	public FixedDeposit(String name, double principal, int duration, IInterest festinterest) {
		super();
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		this.festinterest = festinterest;
	}

	public String getName() {
		return name;
	}

	public double getPrincipal() {
		return principal;
	}

	public int getDuration() {
		return duration;
	}

	public IInterest getInterest() {
		return festinterest;
	}

	public double calculateSimpleInterest() {
		festinterest.getInterest();

		return (getPrincipal() * getDuration() * festinterest.getInterest()) / 100;

	}
}
