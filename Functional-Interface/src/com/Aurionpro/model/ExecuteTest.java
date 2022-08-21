package com.Aurionpro.model;

public class ExecuteTest {

	public static void main(String[] args) {
		ExecuteTask exe = new ExecuteTask();
		exe.execute("Task");

		IExecutable ex = new IExecutable() {
			@Override
			public void execute(String mssg) {
				System.out.println("executing annonymous class   "+mssg);
			}
		};
		ex.execute("Task 2");

		IExecutable ex1 = (String mssg) -> {
			System.out.println("Executing lambda  "+mssg);
		};
		ex1.execute("Task 3");
		
		IExecutable ex2=ExecuteTest::showMessage;
		ex2.execute("Task 4");
	}
	public static void showMessage(String mssg) {
		System.out.println("Show mssg called  "+mssg);
	}

}
