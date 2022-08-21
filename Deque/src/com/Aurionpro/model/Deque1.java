package com.Aurionpro.model;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque1 {
	Deque<Integer> deque = new ArrayDeque<>();
	public static void main(String[] args) {
		

		Deque1 d=new Deque1();
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
		System.out.println(deque.removeLast());
	}
	

	private void push(int element) {
		deque.addLast(element);
	}


	@Override
	public String toString() {
		return "Deque1 [deque=" + deque + "]";
	}
}
