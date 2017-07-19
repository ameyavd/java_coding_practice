package com.ameya.datastructures;

public class QueueUsingLinkedList {

	Node front, rear;
	int sizeOfQue, capacity;

	public class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public QueueUsingLinkedList(int size) {
		front = null;
		rear = null;
		sizeOfQue = size;
		capacity = 0;
	}

	public void IsEmpty() {
		if (sizeOfQue == 0) {
			System.out.println("Queue is empty");
		}
	}

	public void addElements(int data) {
		Node n = new Node(data);
		if (rear == null && front == null) {
			System.out.println("Queue is empty");
			rear = n;
			front = n;
			capacity++;
		} else if (capacity == sizeOfQue) {
			System.out.println("Queue is full. Overflow condition occurs");
		} else if (capacity != sizeOfQue) {
			n.next = rear;
			rear = n;
			capacity++;
		}
	}
	
	public void deleteElement(){
		Node n = rear;
		if(rear == null && front == null){
			System.out.println("Queue is empty. Underflow condition");
		} else {
			int data = front.data;
			front = front.next;
			while(n.next.data != data){
					n = n.next;
			}
			front = n;
			capacity--;
			System.out.println("Element removed from front is:"+data);
		}
	}

	public void displayQueue() {
		int i = 0;
		if (rear == null) {
			System.out.println("Queue is empty");
		} else {
			Node n = rear;
			while (i < capacity) {
				System.out.println("Element:" + n.data);
				n = n.next;
				++i;
			}
		}

	}

	public static void main(String[] args) {

		QueueUsingLinkedList ql = new QueueUsingLinkedList(10);
		ql.addElements(1);
		ql.addElements(2);
		ql.addElements(3);
		ql.addElements(4);
		ql.addElements(5);
		ql.displayQueue();
		ql.deleteElement();
		ql.displayQueue();

	}

}
