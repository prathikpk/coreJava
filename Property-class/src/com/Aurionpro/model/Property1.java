package com.Aurionpro.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Property1 {

	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		FileInputStream in = new FileInputStream("./lib/Info.properties");

		p.load(in);// to load the properties of file in java program
		System.out.println(p.getProperty("Name"));// printing the value in file using key
		System.out.println(p.getProperty("Id"));

		p.list(System.out);// to list all the properties in file
		System.out.println("-------------------------------------");

		System.out.println("Added in the output");
		p.setProperty("Country", "India");// it gets added in the output but not in the file
		System.out.println(p);

		FileOutputStream out = new FileOutputStream("./lib/Info.properties");
		p.store(out, "Updated Property");// to store in property file

	}

}
