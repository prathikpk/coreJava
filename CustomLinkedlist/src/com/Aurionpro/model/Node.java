package com.Aurionpro.model;

public class Node {
	int data;
	Node next;
}

class Linkedlist {
	Node head;

	public void add(int data) {
		Node node = new Node();//creating a new node
		node.data = data;//will assign the user data to new node
		node.next = null;
		if (head == null) {
			head = node;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;//it will jump to next node
			}
			current.next = node;//it will assign the value of new node to current node.next
		}
	}

	public void addfirst(int data) {
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;
	}

	public void remove(int index) {
		if(index==0) {
			head=head.next;
		}else {
			Node current=head;
			for(int i=0;i<index-1;i++) {
				current=current.next;
			}
			Node temp=null;
			temp=current.next;
			current.next=temp.next;
			temp=null;
			
		}
	}
	
	public void insertAt(int index,int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		Node n =head;
		for(int i=0;i<index-1;i++) {
			n=n.next;
		}
		node.next=n.next;
		n.next=node;
	}
	
	
	public void display() {
		Node current = head;
		while (current != null) {
			System.out.print(" " + current.data);
			current = current.next;
		}
		System.out.println("");
	}

}
