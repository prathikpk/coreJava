package com.Aurionpro.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.Aurionpro.model.Employee;

public class SerializeTest {

	public static void main(String[] args) {
		Employee employee=new Employee(101,"Ajay", 30000.0);
 
		try {
			FileOutputStream file=new FileOutputStream("./lib/test.bin");
			ObjectOutputStream out =new ObjectOutputStream(file);
			out.writeObject(employee);
			out.close();
			file.close();
			System.out.println("Employee object serialized");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
