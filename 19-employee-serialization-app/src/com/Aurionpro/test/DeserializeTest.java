package com.Aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.Aurionpro.model.Employee;

public class DeserializeTest {

	public static void main(String[] args) {
        Employee employee=null;
		try {
			FileInputStream file=new FileInputStream("./lib/test.bin");
			ObjectInputStream in=new ObjectInputStream(file);
			
			employee=(Employee) in.readObject();
			in.close();
			file.close();
			System.out.println("Employee object deserialized");
			System.out.println(employee);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
