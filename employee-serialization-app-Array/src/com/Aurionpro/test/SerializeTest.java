package com.Aurionpro.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.Aurionpro.model.Employee;

public class SerializeTest {

	public static void main(String[] args) {
		Employee[] employee = { new Employee(101, "Karan", 40000.0), 
				                new Employee(102, "Sachin", 45000.0),
				                new Employee(103, "Rahul", 35000.0), 
				                new Employee(104, "Raj", 30000.0), 
				               };

		try {
			FileOutputStream file = new FileOutputStream("./lib/test2.bin");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(employee);
			out.close();
			file.close();
			System.out.println("Employee object serialized");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
