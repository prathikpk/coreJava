package com.Aurionpro.test;

import com.Aurionpro.model.Branchtype;
import com.Aurionpro.model.Professor;
import com.Aurionpro.model.Student;

public class EngineeringTest {

	public static void main(String[] args) {
		Student student=new Student(10, "Mumbai", "10 Jan", Branchtype.Extc);
		printDetails(student);
		
		Professor professor =new Professor(101, "Mumbai", "12 March", 30000);
		printDetails(professor);
	}

	private static void printDetails(Professor professor) {
           System.out.println("----------------------------");		
           System.out.println("Professor id:"+professor.getId());
           System.out.println("Professor address:"+professor.getAddress());
           System.out.println("Professor Dob:"+professor.getDob());
           System.out.println("Basic Salary:"+professor.calculateSalary());
        
	}

	private static void printDetails(Student student) {
		System.out.println("----------------------");
		System.out.println("Student id:"+student.getId());
		System.out.println("Student address:"+student.getAddress());
		System.out.println("Student Dob:"+student.getDob());
		System.out.println("Student Branch:"+student.Branch);
	}

}
