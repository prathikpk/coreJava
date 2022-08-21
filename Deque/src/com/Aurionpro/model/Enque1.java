package com.Aurionpro.model;

import java.util.Queue;

public class Enque1 {
	
	public static void main(String[] args) {
		

		Enque1 d=new Enque1();
		d.push(10);
		d.push(30);
		d.push(40);
		
		System.out.println(d.toString());
		d.push(20);
		d.push(50);
		d.push(60);
		System.out.println(d.toString());
		
		d.pop();
		System.out.println(d.toString());
		
		
	}
	public void pop() {
		System.out.println(enque.removeLast());
	}
	

	private void push(int element) {
		deque.addLast(element);
	}


	@Override
	public String toString() {
		return "Deque1 [deque=" + deque + "]";
	}
}
