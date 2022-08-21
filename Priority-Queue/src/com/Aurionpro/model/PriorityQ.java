package com.Aurionpro.model;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQ {

	public static void main(String[] args) {
		PriorityQueue<Integer> p = new PriorityQueue<>();
		p.add(12);
		p.add(10);
		p.add(9);
		p.add(20);
		p.add(2);
		p.add(200);

		System.out.println("Size is:" + p.size());
		System.out.println("------------------------");
		
		System.out.println("Peek:" + p.peek());
		Iterator<Integer> It = p.iterator();
		while (It.hasNext()) {
			System.out.print(It.next() + " ");
		}
		
		System.out.println("\n" + "-------------------");
		System.out.println("Poll:" + p.poll());
		Iterator<Integer> It1 = p.iterator();
		while (It1.hasNext()) {
			System.out.print(It1.next() + " ");
		}
	}

}
