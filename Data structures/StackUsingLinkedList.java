package com.ameya.datastructures;

public class StackUsingLinkedList {
	
	Node top;
	int capacity;
	int size;
	
	public class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public StackUsingLinkedList(int size){
		top=null;
		this.size = size;
		capacity = 0;
	}
	
	public void push(int data){
		Node n = new Node(data);
		if(top == null){
			top = n;
		} else if(capacity != size-1){
			n.next = top;
			top = n;
			++capacity;
		} else {
			System.out.println("Stack is full. Overflow occurs");
		}
	}
	
	public void pop(){
		if(top == null){
			System.out.println("Stack is empty. Underflow condition");
		} else {
			Node newTop = top.next;
			System.out.println("Popped element:"+top.data);
			top = null;
			top = newTop;
			
		}
	}
	
	public void display(){
		if(top == null){
			System.out.println("Stack is empty");
		} else {
			System.out.println("Current top element is:"+top.data);
			Node n = top;
			while(n.next != null){
			System.out.println("Stack elements:"+n.data);
			n = n.next;
			}
		}
	}

	public static void main(String[] args) {
		StackUsingLinkedList stl = new StackUsingLinkedList(10);
		stl.push(0); stl.push(1); stl.push(2); stl.push(3); stl.push(4);
		stl.push(5); stl.push(6); stl.push(7); stl.push(8); stl.push(9);
 		stl.display();
 		stl.pop(); stl.pop(); stl.pop(); stl.pop(); stl.pop(); stl.pop();
 		stl.pop(); stl.pop(); stl.pop(); stl.pop(); stl.pop(); 
 		
 		stl.display();

	}

}
