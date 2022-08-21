package com.Aurionpro.model;

public class ThreadT1 extends Thread{
	
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(500);
			}catch (Exception e) {
			}
			System.out.println(i);
		}
		
	}
	
	
	public static void main(String[] args) {
		ThreadT1 t=new ThreadT1();
		
		//t.start();
		System.out.println("Thread Name:"+t.getName());
		System.out.println("Thread Id:"+t.getId());
		System.out.println(t.isAlive());
		t.start();
		
	}

}
