package com.Aurionpro.model;

public class Country {
	public String countryCode;
	public String countryName;
	public int id;

	public Country(String countryCode, String countryName, int id) {
		super();
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.id = id;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Country [countryCode=" + countryCode + ", countryName=" + countryName + ", id=" + id + "]";
	}

	
}
