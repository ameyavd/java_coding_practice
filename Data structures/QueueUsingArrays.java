package com.ameya.datastructures;

public class QueueUsingArrays {
	
	int que[];
	int rear;
	int front;
	int quesize;
	
	public QueueUsingArrays(int sizeOfQue){
		quesize = sizeOfQue;
		rear = -1;
		front = 0;
		que = new int[quesize];
	}
	
	public void addElement(int e){
		if(rear == -1){
			++rear;
			que[rear] = e;
		}  else if(front == quesize-1){
			System.out.println("Queue is full");
		} else if(rear != -1){
			++front;
			que[front] = e;
		}
	}
	
	public void displayFrontElement(){
		if(front == 0){
			System.out.println("Queue is empty");
		} else {
			System.out.println("Front Element:"+que[front]);
		}
	}
	
	public void displayRearElement(){
		if(rear == -1){
			System.out.println("Queue is empty");
		} else {
			System.out.println("Rear Element:"+que[rear]);
		}
	}
	
	public void deleteElement(){
		if(front == 0){
			System.out.println("Queue is empty");
		} else {
			int removedEle = que[front];
			--front;
			System.out.println("Removed Element:"+removedEle);
		}
	}
	
	public void displayElements(){
		if(rear == -1){
			System.out.println("Queue is empty");
		} else if(rear != -1){
			for(int i = rear; i<= front; ++i){
				System.out.println("Element:"+que[i]);
			}
		}
	}
	

	public static void main(String[] args) {
		
		QueueUsingArrays q = new QueueUsingArrays(10);
		q.displayElements();
		q.addElement(1);
		q.addElement(2);
		q.addElement(3);
		/*q.addElement(4);
		q.addElement(5);
		q.addElement(6);
		q.addElement(7);
		q.addElement(8);
		q.addElement(9);
		q.addElement(10);
		q.addElement(11);*/
		q.displayElements();
		q.displayFrontElement();
		q.displayRearElement();
		/*q.deleteElement();
		q.deleteElement();
		q.displayElements();*/
	}

}
