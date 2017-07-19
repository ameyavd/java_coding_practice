package com.ameya.sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("Bubble Sort");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of list:");
		int n = sc.nextInt();
		System.out.println("Enter elements");
		int[] arr = new int[n];
		for(int i=0; i< n; ++i){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Sorting elements:");
		int temp = 0;
		for(int i = 0; i < n-1; i++){
			for(int j=i+1; j<n; j++){
				if(arr[i] > arr[j]){
					 temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Sorted list");
		for(int i=0; i<n; ++i){
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}
