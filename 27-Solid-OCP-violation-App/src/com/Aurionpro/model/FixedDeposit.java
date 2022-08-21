package com.Aurionpro.model;

public class FixedDeposit {
	public String name;
	public double principal;
	public int duration;
	public FestivalType festival;

	public FixedDeposit(String name, double principal, int duration, FestivalType festival) {
		super();
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		this.festival = festival;
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

	public FestivalType getFestival() {
		return festival;
	}
	
	private double getInterestRates() {
		if(festival==FestivalType.DIWALI) {
			return 7.8;
		}else if(festival==FestivalType.CHRISTMAS) {
			return 7.5;
		}else if(festival==FestivalType.NEWYEAR) {
			return 7;
		}
		return 6.5;
	}
	public double calculateSimpleInterest() {
		return (getPrincipal()*getDuration()*getInterestRates())/100;
		
	}

}
