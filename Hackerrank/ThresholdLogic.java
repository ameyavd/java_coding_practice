package com.ameya.hackerrank;

import java.util.Scanner;

public class ThresholdLogic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Inputs:");
		int input = sc.nextInt();
		int rows = (int) Math.pow(2,input);
		int res[][] = new int[rows][input], fullRowOR[] = new int[input], fullRowAND[] = new int[input], outputDis = 0, outputCon = 0;
		
		System.out.println("Truth Table for Disjunction");
		
		 for (int i=0; i<input; i++) {
			 System.out.print("I"+i+" ");
		 }
		 System.out.print("O");
		 System.out.println();
		 for (int i=0; i<rows; i++) {
	            for (int j=input-1; j>=0; j--) {
	             res[i][j] =   i/(int) Math.pow(2, j)%2;
	             fullRowOR[j] = res[i][j];
	             System.out.print(res[i][j]+"  ");
	            }
	           outputDis = orRow(fullRowOR);
	           System.out.println(outputDis);
	        }
		 System.out.println(); System.out.println();
		 System.out.println("Truth Table for Conjunction");
		 for (int i=0; i<input; i++) {
			 System.out.print("I"+i+" ");
		 }
		 System.out.print("O");
		 System.out.println();
		 for (int i=0; i<rows; i++) {
	            for (int j=input-1; j>=0; j--) {
	             res[i][j] =   i/(int) Math.pow(2, j)%2;
	             fullRowAND[j] = res[i][j];
	             System.out.print(res[i][j]+"  ");
	            }
	           outputCon = andRow(fullRowAND);
	           System.out.println(outputCon);
	        }
		 
		sc.close();
	}
	public static int orRow(int fullRowOR[]){
		int result = fullRowOR[0];
		 for(int i = 1; i<fullRowOR.length; ++i){
			 result = result | fullRowOR[i];
		 }
		 return result;
	}
	
	public static int andRow(int fullRowAND[]){
		int oneCounter = 0;
		int result = fullRowAND[0];
		if(result == 1)
			oneCounter++;
		 for(int i = 1; i<fullRowAND.length; ++i){
			 if(fullRowAND[i] == 1){
				 oneCounter++;
			 }
			 result = result & fullRowAND[i];
		 }
		 if(oneCounter >= 2){
			 result = 1;
			
		 } 
		 return result;
	}

}
