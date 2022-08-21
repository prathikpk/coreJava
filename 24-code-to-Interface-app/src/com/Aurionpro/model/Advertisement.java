package com.Aurionpro.model;

public class Advertisement {
	IDisplayable disp;

	public void setDisp(IDisplayable disp) {
		this.disp = disp;
	}

	public void showDisplay() {
		disp.display();
	}
}
