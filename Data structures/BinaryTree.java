package com.ameya.datastructures;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import com.ameya.datastructures.BinaryTree.Node;

public class BinaryTree{

	Node root;
	int count = 0;
	static class Node {
		int key;
		String value;
		Node leftChild;
		Node rightChild;

		public Node(int key, String value) {
			this.key = key;
			this.value = value;
		}

		public String toString(Node node) {
			String display = "The key" + node.key + " has value:" + node.value;
			return display;
		}

	}

	public void addNode(Node node) {
		if (root == null) {
			root = node;
		} else {
			Node current = root;
			while (current != null) {
				if (node.key < current.key) {
					if (current.leftChild == null) {
						current.leftChild = node;
						return;
					} else {
						current = current.leftChild;
					}

				} else if (current.key < node.key) {
					if (current.rightChild == null) {
						current.rightChild = node;
						return;
					} else {
						current = current.rightChild;
					}
				}
			}

		}
	}

	public void displayTreeInorder(Node node) {
		if (node != null) {
			displayTreeInorder(node.leftChild);
			System.out.print(node.key + " ");
			displayTreeInorder(node.rightChild);
		}
	}

	public void displayTreePreorder(Node node) {
		if (node != null) {

			System.out.println(node.value);
			displayTreePreorder(node.leftChild);
			displayTreePreorder(node.rightChild);
		}
	}

	public void displayTreePostorder(Node node) {
		if (node != null) {
			displayTreePostorder(node.leftChild);
			displayTreePostorder(node.rightChild);
			System.out.println(node.value);
		}
	}

	public void displaylLeafNodes(Node node) {

		if (node == null) {
			return;
		}
		if (node.leftChild == null && node.rightChild == null) {
			System.out.println(node.value);
		}
		displaylLeafNodes(node.leftChild);
		displaylLeafNodes(node.rightChild);
	}

	public int countLeafNodes(Node currentNode) {
		// int count = 0;
		if (currentNode == null) {
			return 0;
		}
		if (currentNode.leftChild == null && currentNode.rightChild == null) {
			return 1;
		}
		return countLeafNodes(currentNode.leftChild) + countLeafNodes(currentNode.rightChild);

	}   

	public int countNodes(Node node) {
		 
		 if (node != null) {
			count++;
			countNodes(node.leftChild);
			countNodes(node.rightChild);

		}
		 return count;
		
	}

	public void displayMinimumValue() {
		if (root == null) {
			return;
		}

		if (root != null) {
			Node current = root;

			while (current.leftChild != null) {
				current = current.leftChild;
			}
			System.out.println("Lowest Value in tree is:" + current.key);
		}
	}

	public void displayMaximumValue() {
		if (root == null) {
			return;
		}

		if (root != null) {
			Node current = root;
			while (current.rightChild != null) {
				current = current.rightChild;
			}
			System.out.println("Highest Value in tree is:" + current.key);
		}
	}

	public void displayLevelOrderedNode(Node node) { // display elements by
														// Breadth first
		if (root == null) {
			return;
		} else {
			Queue<Node> queue = new LinkedList<Node>();
			queue.add(node);
			while (!queue.isEmpty()) {
				Node n = queue.poll();
				System.out.println("display data of tree:" + n.value);
				if (n.leftChild != null) {
					queue.add(n.leftChild);
				}
				if (n.rightChild != null) {
					queue.add(n.rightChild);
				}

			}
		}
	} 
	
	public void rootToLeafAllPath(Node node, int arr[], int len){
		if(node == null){
			return;
		}
		
		arr[len] = node.key;
		len++;
		
		if(node.leftChild == null && node.rightChild == null){
			for(int i=0; i<len; ++i){
			System.out.print(arr[i]+" ");
			}
			System.out.println();
			return;
		}
		
		rootToLeafAllPath(node.leftChild, arr, len);
		rootToLeafAllPath(node.rightChild, arr, len);
		
	}
	
	public void sumOfAllNodes(Node n){
		
	}
	
	public int height(Node root) {
        int height = 0;
        Node node = root;
      	// Write your code here.
        while(node != null){
          if(node.leftChild != null || node.rightChild != null){
              ++height;
          }
        } 
        return height;
    }

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		Node n1 = new Node(50, "g");
		Node n2 = new Node(12, "a");
		Node n3 = new Node(55, "z");
		Node n4 = new Node(45, "s");
		Node n5 = new Node(78, "q");
		Node n6 = new Node(96, "r");
		Node n7 = new Node(10, "h");
		Node n8 = new Node(9, "e");
		Node n9 = new Node(74, "k");
		Node n10 = new Node(63, "v");
		bt.addNode(n1);
		bt.addNode(n2);
		bt.addNode(n3);
		bt.addNode(n4);
		bt.addNode(n5);
		bt.addNode(n6);
		bt.addNode(n7);
		bt.addNode(n8);
		bt.addNode(n9);
		bt.addNode(n10);
		System.out.println("Inorder");
		bt.displayTreeInorder(n1);
		System.out.println();
		System.out.println("Displaying child nodes");
		bt.displaylLeafNodes(n1);
		bt.displayMinimumValue();
		bt.displayMaximumValue();
		bt.displayLevelOrderedNode(n1);
		int c = bt.countLeafNodes(n1);
		System.out.println("Leaf node Count:" + c);
		int count = bt.countNodes(n1);
		System.out.println("Total Number of nodes in Tree are:"+count);
		System.out.println("Printing all paths");
		bt.rootToLeafAllPath(n1,new int[100], 0);

		/*
		 * System.out.println("Pre order"); bt.displayTreePreorder(n1);
		 * System.out.println("Post Order"); bt.displayTreePostorder(n1);
		 */
	}

}
