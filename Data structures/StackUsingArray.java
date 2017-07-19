package com.ameya.datastructures;

public class StackUsingArray {
	
	int maxSize;
	int[] stackArray;
	int top;
	
	public StackUsingArray(int size){
		maxSize = size;
		top = -1;
		stackArray = new int[maxSize];
	}
	
	public void push(int element){
		
		if(top != maxSize-1){
			++top;
			stackArray[top] = element;
		} else {
			System.out.println("Stack is full. Overflow occurs");
		}
	}
	
	public void peek(){
		if(top != -1){
			System.out.println("Top of Stack Element:"+stackArray[top]);
		} else {
			System.out.println("Stack is empty");
		}
	}
	public void pop(){
		System.out.println(top);
		if(top != -1){
			int eleRemoved = stackArray[top];
			top--;
			System.out.println("Removed Element is:"+eleRemoved);
		} else {
			System.out.println("Stack is empty. Underflow condition occurs");
		}
	}
	
	public void displayStack(){
		if(top != -1){
			for(int i=0; i<=top; ++i){
				System.out.println("Stack Elements:"+stackArray[i]);
			}
		} else {
			System.out.println("Stack is empty");
		}
	}

	public static void main(String[] args) {
		StackUsingArray sta = new StackUsingArray(10);
		sta.push(0);
		sta.push(1);
		sta.push(2);
		sta.push(3);
		sta.push(4);
		sta.push(5);
		sta.push(6);
		sta.push(7);
		sta.push(8);
		sta.push(9);
		sta.peek();
		sta.push(10);
		//sta.push(11);
		sta.displayStack();
		sta.peek();
		sta.pop();
		sta.pop(); sta.pop(); sta.pop(); sta.pop(); sta.pop(); sta.pop(); sta.pop(); sta.pop(); sta.pop(); sta.pop();
		sta.displayStack();
		sta.peek();
	}

}
