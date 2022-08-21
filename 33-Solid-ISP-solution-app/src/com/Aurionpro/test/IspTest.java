package com.Aurionpro.test;

import com.Aurionpro.model.IEatable;
import com.Aurionpro.model.IWorkable;
import com.Aurionpro.model.Manager;
import com.Aurionpro.model.Robot;

public class IspTest {

	public static void main(String[] args) {
		IWorkable manager = new Manager();
		IEatable manager1 = new Manager();
		attheWorkstation(manager);
		attheCanteen(manager1);

		IWorkable robot = new Robot();
		attheWorkstation(robot);
	}

	private static void attheWorkstation(IWorkable worker) {
		worker.startWork();
		worker.stopWork();
	}

	private static void attheCanteen(IEatable worker) {
		worker.startEat();
		worker.stopEat();
	}

}
