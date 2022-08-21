package com.Aurionpro.model;

public class Players {
	private String name;
	private int run;
	private int matches;

	public Players(String name, int run, int matches) {
		super();
		this.name = name;
		this.run = run;
		this.matches = matches;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	public int getMatches() {
		return matches;
	}

	public void setMatches(int matches) {
		this.matches = matches;
	}

	@Override
	public String toString() {
		return "Players [name=" + name + ", run=" + run + ", matches=" + matches + "]";
	}

}
