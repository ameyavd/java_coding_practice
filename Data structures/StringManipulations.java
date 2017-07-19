package com.ameya.datastructures;

import java.util.ArrayList;
import java.util.Arrays;

public class StringManipulations {

	String s1 = new String();
	String reverse;

	public StringManipulations(String s1) {
		this.s1 = s1;
	}

	public void reverseString() {
		for (int i = s1.length() - 1; i >= 0; --i) {
			reverse = reverse + s1.charAt(i);
		}
		System.out.println("Reversed String is:" + reverse);
	}
	
	 public String reverseWordByWord(String str){
	        int strLeng = str.length()-1;
	        String reverse = "", temp = "";

	        for(int i = 0; i <= strLeng; i++){
	            temp += str.charAt(i);
	            if((str.charAt(i) == ' ') || (i == strLeng)){
	                for(int j = temp.length()-1; j >= 0; j--){
	                    reverse += temp.charAt(j);
	                    if((j == 0) && (i != strLeng))
	                        reverse += " ";
	                }
	                temp = "";
	            }
	        }
	        return reverse;
	    }

	public void stringsAnagrams(String s1, String s2) {
		char[] cs1 = s1.toCharArray();
		char[] cs2 = s2.toCharArray();
		Arrays.sort(cs1);
		Arrays.sort(cs2);
		s1 = String.valueOf(cs1);
		s2 = String.valueOf(cs2);
		if (s1.equals(s2)) {

			System.out.println("Strings are Anagrams");
		} else {
			System.out.println("Strings are not anagrams");
		}
	}

	public void findLengthofString(String s1) {
		char[] cs1 = s1.toCharArray();
		int i = 0;
		for (char c : cs1) {
			++i;
		}

		System.out.println("Lenght of string:" + i);
	}

	public void subStringInJava(String s1) {
		System.out.println("Displaying all substrings of String:" + s1);
		for (int i = 0; i < s1.length(); ++i) {
			for (int j = i + 1; j <= s1.length(); ++j) {
				System.out.println(s1.substring(i, j));
			}
		}

	}

	public Character nonRepeatedChar(String s1) {
		char[] cs1 = s1.toCharArray();
		for (int i = 0; i < s1.length(); ++i) {
			if (s1.lastIndexOf(cs1[i]) == s1.indexOf(cs1[i])) {
				return cs1[i];
			}
		}
		return null;
	}

	public void checkPalindrome(String s1) { // With string builder
		char cs[] = s1.toCharArray();
		StringBuilder sb = new StringBuilder(s1);
		String s2 = sb.reverse().toString();

		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}

	public void checkStringPalindrome(String s1) { // Without string builder

		for (int i = 0, j = s1.length() - 1; i < s1.length() / 2; i++, j--) {
			if (s1.charAt(i) == s1.charAt(j)) {
				System.out.println("Palindrome");
			} else {
				System.out.println("Not a palindrome str");
			}
		}
	}

	public void findDuplicateChar(String s1) {
		ArrayList<Character> rep = new ArrayList<>();
		for (int i = 0; i < s1.length(); ++i) {
			for (int j = i + 1; j < s1.length(); j++) {
				if (s1.charAt(i) == s1.charAt(j)) {
					rep.add(s1.charAt(i));
				}
			}
		}

		for (Character c : rep)
			System.out.println("Rep chars are:" + c);
	}

	public static void main(String[] args) {
		StringManipulations str = new StringManipulations("qwerty");
		str.reverseString();
		str.stringsAnagrams("qwerty", "ytrewq");
		str.findLengthofString("ameyaa");
		str.subStringInJava("abbc");
		// char a = str.nonRepeatedChar("ameya");
		System.out.println("Non repeated first character is:" + str.nonRepeatedChar("ameya"));
		str.checkPalindrome("aabaa");
		str.checkStringPalindrome("nitin");
		str.findDuplicateChar("nitin");
		
		String news = str.reverseWordByWord("I am studying");
		System.out.println(news);
	}

}
