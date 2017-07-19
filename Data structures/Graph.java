package com.ameya.datastructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
	static class Node {
		int data;
		boolean visited;

		public Node(int data) {
			this.data = data;
		}
	}

	Queue<Node> que = new LinkedList<Node>();
	static ArrayList<Node> nodes = new ArrayList<Node>();

	public ArrayList<Node> findNeighbours(int adj_mat[][], Node x) {
		int nodeIndex = -1;

		ArrayList<Node> neighbour = new ArrayList<Node>();
		for (int i = 0; i < nodes.size(); ++i) {
			if (nodes.get(i).equals(x)) {
				nodeIndex = i;
				break;
			}
		}

		if (nodeIndex != 1) {
			for (int j = 0; j < adj_mat[nodeIndex].length; j++) {
				if (adj_mat[nodeIndex][j] == 1) {
					neighbour.add(nodes.get(j));
				}
			}

		}
		return neighbour;
	}

	public void BreadFirstSearch(int adj_mat[][], Node node) {
		que.add(node);
		node.visited=true;
		while(!que.isEmpty()){
			Node ele = que.remove();
			System.out.println(ele.data);
			ArrayList<Node> neigh = findNeighbours(adj_mat, ele);
			for(int i =0; i<neigh.size(); ++i){
				Node n =  neigh.get(i);
				if(n!=null && !n.visited){
					que.add(n);
					n.visited = true; 	
				}
			}
		}
	}

	public static void main(String[] args) {
		Node n1 = new Node(40);
		Node n2 = new Node(50);
		Node n3 = new Node(60);
		Node n4 = new Node(70);
		Node n5 = new Node(80);
	
		nodes.add(n1);nodes.add(n2);nodes.add(n3);nodes.add(n4);nodes.add(n5);
		
		int adj_mat[][] = {
				{0,1,1,1,0},{0,0,0,1,0},{0,0,0,0,1},{0,0,0,0,1},{0,0,0,0,0}	
		};
		Graph g1 = new Graph();
		g1.BreadFirstSearch(adj_mat, n1);
		
	}

}
