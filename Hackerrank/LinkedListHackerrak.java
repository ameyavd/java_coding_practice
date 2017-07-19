package com.ameya.hackerrank;

public class LinkedListHackerrak {
	
	Node head;
	public class Node{
		int data;
		Node next;
		
		public Node(){
			next = null;
		}
	}
	
	public void addNode(int data){
		Node n = new Node();
		n.data = data;
		
		if(head == null){
			head = n;
		} else {
			Node curr = head;
			while(curr.next != null){
				curr = curr.next;
			}
			curr.next = n;
		}
	}

	public void printList(){
		Node n = head;
		while(n != null){
			System.out.println(n.data);
			n = n.next;
		}
	}
	
	public Node insertAtPosition(int position, int data){
		Node newN = new Node();
		newN.data = data;
		int counter = 0;
		Node curr=head, prev =null;
		if(head == null){
			head = newN;
		} else if(position == 0){
			newN.next = head;
			head = newN;
		} else {
			while(curr.next != null && counter < position -1){
				if(position == counter){
					prev.next = newN;
					newN.next = curr;
				} else {
				prev = curr;
				curr = curr.next;
				++counter;
				}
			} if(curr.next == null){
				curr.next = newN;
				
			}
		}
		return head;
	}
	public static void main(String[] args) {
		LinkedListHackerrak ll = new LinkedListHackerrak();
		ll.addNode(0);
		ll.addNode(1);
		ll.addNode(2);
		ll.addNode(3);
		ll.addNode(4);
		ll.addNode(5);
	//	ll.printList();
		ll.insertAtPosition( 5, 8);
		ll.printList();
	}

}
