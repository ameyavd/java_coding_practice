package com.ameya.hackerrank;

import java.util.Scanner;

/*
 * A left rotation operation on an array of size n shifts each of the array's elements 1 unit 
 * to the left. For example, if 2 left rotations are performed on array [1,2,3,4,5], 
 * then the array would become [3,4,5,1,2].
 *
 *Given an array of n integers and a number, d, perform d left rotations on the array. 
 *Then print the updated array as a single line of space-separated integers.
 * */
public class ArrayLeftRotation {

	 public void arrayleftRotation(int[] a, int n, int k) {
		 for(int i=0; i<k;i++){
			 leftRotateByOne(a, n);
		 }
	 }
	 
	 
	 
	 public void leftRotateByOne(int a[], int n){
		 int i, temp = a[0];
		 for( i=0; i<n-1;i++){
			 a[i] = a[i+1];
		 }
		 a[i] = temp;
		 
	 }
	    
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	        int a[] = new int[n];
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	      ArrayLeftRotation lar = new ArrayLeftRotation();
	        int[] output = new int[n];
	         lar.arrayleftRotation(a, n, k);
	         System.out.println("Display Array:");
		    	for(int i=0; i<=n-1; i++){
		    		System.out.print(a[i]+" ");
		    	}
		    	
		    
		    
	      
	    }
}
