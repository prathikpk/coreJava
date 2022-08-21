package com.Aurionpro.test;

import com.Aurionpro.model.IWorker;
import com.Aurionpro.model.Manager;
import com.Aurionpro.model.Robot;

public class IspTest {

	public static void main(String[] args) {
		IWorker manager=new Manager();
		attheWorkstation(manager);
		attheCanteen(manager);
		Robot robot=new Robot();
		attheWorkstation(robot);
		attheCanteen(robot);
	}

	private static void attheWorkstation(IWorker worker) {
		worker.startWork();
		worker.stopWork();
	}

	private static void attheCanteen(IWorker worker) {
		worker.startEat();
		worker.stopEat();
	}

}
