package com.ameya.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class HourGlassCalculation {

	public static void main(String[] args) {
		System.out.println("Enter array elements");
		int arr[][] = { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0 }, 
				{ 0, 0, 2, 4, 4, 0 },
				{ 0, 0, 0, 2, 0, 0 }, { 0, 0, 1, 2, 4, 0 } };
		int arrTotal[] = new int[16];
		HourGlassCalculation hg = new HourGlassCalculation();
arrTotal[0] =		hg.diffHG(arr, 0, 3, 0, 3);
arrTotal[1] =hg.diffHG(arr, 0, 3, 1, 4);
arrTotal[2] =hg.diffHG(arr, 0, 3, 2, 5);
arrTotal[3] =	hg.diffHG(arr, 0, 3, 3, 6);

arrTotal[4] =	hg.diffHG(arr, 1, 4, 0, 3);
arrTotal[5] =hg.diffHG(arr, 1, 4, 1, 4);
arrTotal[6] =	hg.diffHG(arr, 1, 4, 2, 5);
arrTotal[7] =hg.diffHG(arr, 1, 4, 3, 6);
		
arrTotal[8] =	hg.diffHG(arr, 2, 5, 0, 3);
arrTotal[9] =	hg.diffHG(arr, 2, 5, 1, 4);
arrTotal[10] =	hg.diffHG(arr, 2, 5, 2, 5);
arrTotal[11] =	hg.diffHG(arr, 2, 5, 3, 6);
		
arrTotal[12] =	hg.diffHG(arr, 3, 6, 0, 3);
arrTotal[13] =	hg.diffHG(arr, 3, 6, 1, 4);
arrTotal[14] =	hg.diffHG(arr, 3, 6, 2, 5);
arrTotal[15] =	hg.diffHG(arr, 3, 6, 3, 6);

Arrays.sort(arrTotal, 0, 16);
System.out.println("Maximum Hourglass value="+arrTotal[15]);
		
	}

	

	public int diffHG(int arr[][], int m, int n, int k, int l) {
	//	System.out.println("Printing Hour glass no");
		int total = 0;
		for (int arr_i = m; arr_i < n; ++arr_i) {
			for (int arr_j = k; arr_j < l; arr_j++) {
				if (arr_i == m + 1 && (arr_j == k || arr_j == l - 1)) {
				//	System.out.print(" ");
				} else{
					//System.out.print(arr[arr_i][arr_j]);
					total = total + arr[arr_i][arr_j];
				}
				
			}
		//	System.out.println();
			
		}
	//	System.out.println();
	//	System.out.println(total);
		return total;
	}
	
	
}