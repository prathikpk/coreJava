package com.Aurionpro.model1;

public class Player {
	private int id;
	private String name;
	private int matches;
	private int runs;
	private int wickets;

	public Player(int id, String name, int matches, int runs, int wickets) {
		super();
		this.id = id;
		this.name = name;
		this.matches = matches;
		this.runs = runs;
		this.wickets = wickets;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getMatches() {
		return matches;
	}

	public int getRuns() {
		return runs;
	}

	public int getWickets() {
		return wickets;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", matches=" + matches + ", runs=" + runs + ", wickets="
				+ wickets + "]";
	}

	
	

}