package com.Aurionpro.model;

public class Regions {
	public int code;
	public String region;

	public Regions(int code, String region) {
		super();
		this.code = code;
		this.region = region;
	}

	public int getCode() {
		return code;
	}

	public String getRegion() {
		return region;
	}

	@Override
	public String toString() {
		return "Regions [code=" + code + ", region=" + region + "]";
	}

}
