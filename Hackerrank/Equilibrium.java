package com.ameya.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class Equilibrium {
	public static void main(String[] args) {
		int sum = 0, leftsum = 0, rightsum = 0;
		List<Integer> equilibriumIndex = new ArrayList<>();
		int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
		for (int i : arr) {
			sum = sum + i;
		}
		System.out.println(sum);
		for(int i=0 ; i< arr.length; ++i){
			rightsum = 0; leftsum=0;
		
			if (i==0)
				leftsum += 0;
			else{
				for(int j=i ; j > 0; --j){
				leftsum += arr[j-1];
				}
			}
			System.out.print(i+"Leftsum"+leftsum+" ");
			
			for(int j = i+1; j<arr.length; ++j){
				rightsum = rightsum + arr[j];
			}
			System.out.print("Rightsum"+rightsum);
			System.out.println();
			if(leftsum == rightsum){
				equilibriumIndex.add(i);
			//	System.out.println("true");
			}
		}
		for(Integer i : equilibriumIndex)
		System.out.println("Equiindex" + i);
	}
}
