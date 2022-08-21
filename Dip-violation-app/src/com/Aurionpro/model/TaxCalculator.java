package com.Aurionpro.model;

public class TaxCalculator {
	LogType logger;

	public TaxCalculator(LogType logger) {
		super();
		this.logger = logger;
	}

	public double calculateTax(int amount, int rate) {
		double tax = 0;
		try {
			tax = amount / rate;
		} catch (Exception e) {
			if (logger == LogType.DB) {
				new DBLogger().log("An error occured" + e.getMessage());
			} else if (logger == LogType.FILE) {
				new FileLogger().log("An error occured" + e.getMessage());
			}
		}
		return tax;

	}

}
