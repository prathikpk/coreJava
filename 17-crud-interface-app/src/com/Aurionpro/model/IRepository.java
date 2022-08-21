package com.Aurionpro.model;

public interface IRepository {

	void create();
	void read();
	void update();
	void delete();
	default void write() {
		System.out.println("writing");
	}
}
