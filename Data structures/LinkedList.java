package com.ameya.datastructures;

public class LinkedList {

	Node head; // first node of the list

	static class Node {

		int data;
		Node next;

		// constructor to initialize first nodes of Linked list
		public Node(int d) {
			data = d;
			next = null;
		}

	}

	public static void main(String args[]) {

		LinkedList lList = new LinkedList();
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		first.next = second;
		second.next = third;

		lList.head = first;

		/*
		 * System.out.println("Head Node Data:"+first.data+" Next Node:"+first.
		 * next);
		 * System.out.println("Second Node Data:"+second.data+" Next Node:"
		 * +second.next);
		 * System.out.println("Third Node Data:"+third.data+" Next Node:"+third.
		 * next);
		 */
		lList.pushAtFront(0);
		lList.append(4);
		lList.insertInBetween(second, 40);
		// lList.deleteNode(3);
		// lList.deleteAtPosition(5);
		lList.printList(lList);
		//lList.countLength();
		//lList.swapNodes(0, 3);
		lList.reverselinkedList(first);
		//lList.printList(lList);
	}

	public void printList(LinkedList lList) {
		System.out.println("Printing the contents of List");
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	public void pushAtFront(int data) {
		Node new_head = new Node(data);
		new_head.next = head;
		head = new_head;

	}

	public void append(int data) {
		Node new_Last = new Node(data);

		// if list is empty then make new node as head
		if (head == null) {
			head = new_Last;
		}

		// Else traverse to the last node and make the new node as last
		Node node = head;
		while (node.next != null) {
			node = node.next;
			// System.out.println("Found last node data" + node.data);
		}
		node.next = new_Last;
	}

	public void insertInBetween(Node prev_Node, int data) {
		if (prev_Node.next == null) {
			System.out.println("Previous node cannot be null");
		}
		Node new_Node = new Node(data);
		new_Node.next = prev_Node.next;
		prev_Node.next = new_Node;
	}

	public void deleteNode(int key) {
		Node temp = head, prev = null;
		if (temp != null && temp.data == key) {
			head = temp.next;
			return;
		}
		while (temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}
		if (temp == null) {
			return;
		}
		prev.next = temp.next;
	}

	public void deleteAtPosition(int position) {

		Node temp = head, prev = null;
		int count = 0;
		if (temp != null && position == 0) {
			head = temp.next;
			return;
		}
		while (temp != null && temp.next != null) {
			prev = temp;
			temp = temp.next;
			count++;
			if (count == position) {
				prev.next = temp.next;
			}
		}
	}

	public void countLength() {
		Node temp = head;
		int count = 0;
		while (temp.next != null) {
			++count;
			temp = temp.next;
		}
		count++;
		System.out.println("Length of Linked List is:" + count);

	}

	public void swapNodes(int key1, int key2) {

		if (key1 == key2) {
			return;
		}
		
		// Search key1 and keep track of Prevkey1 and CurrKey1
		Node prevkey1 = null, currKey1 = head;
		while (currKey1 != null && currKey1.data != key1) {
			prevkey1 = currKey1;
			currKey1 = currKey1.next;
		}
		System.out.println(currKey1.data);
		// Search key2 and keep track of Prevkey1 and CurrKey1
		Node prevkey2 = null, currKey2 = head;
		while (currKey2 != null && currKey2.data != key2) {
			prevkey2 = currKey2;
			currKey2 = currKey2.next;

		}
		System.out.println(currKey2.data);
		//If key1 or key2 is not present then do nothing
		if(currKey1 == null || currKey2 == null){
			return;
		}
		
		//if key1 is not head of the list
		if(prevkey1 != null){
			prevkey1.next = currKey2;
		} else { //make key2 as head
			head = currKey2;
		}
		
		//if key2 is not the head of the list
		if(prevkey2 != null){
			prevkey2.next = currKey1;
		} else { //make key1 as head
			head = currKey1;
		}
		
		//Swap next pointers
		Node temp = currKey1.next;
		currKey1.next = currKey2.next;
		currKey2.next = temp;
	}
	
	public void reverselinkedList(Node node){
		Node current = node, prev = null, next = null;
		while(current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		System.out.println("Reverse List");
		while(node != null){
			System.out.println(node.data);
			node = node.next;
		}
		 
	}
}
