package com.ameya.sorting;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		System.out.println("Insertion Sort");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of list:");
		int n = sc.nextInt();
		System.out.println("Enter elements");
		int[] arr = new int[n];
		for(int i=0; i< n; ++i){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Sorting elements:");
		if(n <= 1){
			System.out.println("List is sorted"+arr[0]);
		} else {
			int temp = 0;
			for(int i=1; i<n; ++i){
				for(int j=i; j>0; j--){
					if(arr[j] < arr[j-1]){
						temp = arr[j];
						arr[j] = arr[j-1];
						arr[j-1]= temp;
					}
				}
			}
		}
		
		for(int i =0; i<arr.length ; i++){
			System.out.println(arr[i]);
			
		}
		
	}

}
