package com.ameya.datastructures;

import java.util.Arrays;
import java.util.Scanner;

public class StringManipulationsPrac {

	public void uniqueChars(String s) {
		char[] c1 = s.toCharArray();
		boolean flag = false;
		for (int i = 0; i < c1.length; ++i) {
			for (int j = i + 1; j < c1.length; ++j) {
				if (c1[i] == c1[j]) {
					flag = true;
				}
			}
		}
		if (flag) {
			System.out.println("String doesnt have unique chars");
		} else {
			System.out.println("String has unique chars");
		}
	}

	public void stringRevCStyle(String s) {
		String rev = null;
		for (int i = s.length() - 1; i >= 0; --i) {
			rev = rev + s.charAt(i);
		}
		System.out.println("Reversed String is:" + rev);
	}

	public void removeDuplicateChars(String s) {
		// StringBuilder sb = new StringBuilder();
		char[] c1 = s.toCharArray();
		String s1 = new String();
		for (int i = 0; i < c1.length; ++i) {
			for (int j = i + 1; j < c1.length; ++j) {
				if (c1[i] == c1[j]) {
					c1[j] = ' ';

				}
			}
		}

		for (int i = 0; i < c1.length; ++i) {
			if (c1[i] != ' ') {
				s1 = s1 + c1[i];
			}
		}
		System.out.println("New Str: " + s1);
	}
	
	public void StringComp(){
		String input = "AAABBBBCCDEF";
		int count = 1;
		char last = input.charAt(0);
		StringBuilder output = new StringBuilder();
		for(int i = 1; i < input.length(); i++){
		    if(input.charAt(i) == last){
		    count++;
		    }else{
		        if(count > 1){
		            output.append(""+last+count);
		        }else{
		            output.append(last);
		        }
		    count = 1;
		    last = input.charAt(i);
		    }
		}
		if(count > 1){
		    output.append(""+last+count);
		}else{
		    output.append(last);
		}
		System.out.println(output.toString());
	}

	public void stringAnagrams(String s1, String s2) {
		char[] c1 = s1.toCharArray(), c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		s1 = String.valueOf(c1);
		s2 = String.valueOf(c2);
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("String are anagrams");
		} else {
			System.out.println("Not anagrams");
		}
	}

	public void stringReplaceSpaces(String s) {

		System.out.println(s.replace(" ", "%20"));

	}

	public void reverseEachWord(String s) {
		String rev = new String();
		s = s.replace(" ", "_");
		System.out.println(s);
		String[] str = s.split("_");
		for (String s1 : str) {
			s1 = reverseStr(s1);
			System.out.print(s1);
		}
	}

	private String reverseStr(String s) {
		String st = new String();
		for (int i = s.length() - 1; i >= 0; --i) {
			st = st + s.charAt(i);
		}
		return st;
	}

	public void allSubString(String s) {
		char[] c1 = s.toCharArray();
		for (int i = 0; i < c1.length; ++i) {
			for (int j = i + 1; j <= c1.length; ++j) {
				System.out.println(s.substring(i, j));
			}
		}
	}

	public void checkPalindrome(String s) {
		StringBuilder sb = new StringBuilder(s);
		String rev = sb.reverse().toString();

		if (s.equalsIgnoreCase(rev)) {
			System.out.println("String are Palindrome");
		} else {
			System.out.println("Not");
		}
		int count = 0;
		for (int i = 0, j = s.length() - 1; i < s.length() / 2; ++i, --j) {
			if (s.charAt(i) == s.charAt(j)) {
				count++;
			}
		}

		if (count == s.length() / 2) {
			System.out.println("P");
		} else {
			System.out.println("NP");
		}

	}

	public void rotateMatrix(int r, int c, Scanner sc) {
		int[][] arr = new int[r][c];
		System.out.println("Enter elements");

		for (int i = 0; i < r; ++i) {
			for (int j = 0; j < c; ++j) {
				arr[i][j] = sc.nextInt();
			}

		}

		for (int i = 0; i < r; ++i) {
			for (int j = 0; j < c; ++j) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("after rotation");
		for (int i = 0; i < c; ++i) {
			for (int j = r-1; j >= 0; --j) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// System.out.println("Enter the String1:");
		Scanner sc = new Scanner(System.in);
		// String s1 = sc.nextLine();
		/*
		 * System.out.println("Enter the String2:"); String s2 = sc.nextLine();
		 */
		StringManipulationsPrac smp = new StringManipulationsPrac();
		// smp.uniqueChars(s1);
		// smp.stringRevCStyle(s1);
		// smp.removeDuplicateChars(s1);
		// smp.stringAnagrams(s1, s2);
		// smp.stringReplaceSpaces(s1);
		// smp.reverseEachWord(s1);
		// smp.allSubString(s1);
		// smp.checkPalindrome(s1);
		//smp.rotateMatrix(3, 3, sc);
		smp.StringComp();
		sc.close();

	}

}
