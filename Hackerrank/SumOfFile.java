package com.ameya.hackerrank;

public class SumOfFile {

	public static void main(String[] args) {
		String s = "dir1\n dir11\n dir12\n dir121\n   picture.jpeg\n";
		SumOfFile st = new SumOfFile();
		System.out.println(st.solution(s));
		
	}
	public int solution (String s) {
		String[] lineSplit = s.split("\n");
	       int sum=0, spaces=0;
	       for(int i=lineSplit.length-1;i>=0;i--){
	           String line=lineSplit[i];
	           if(line.contains(".gif") | line.contains(".jpeg") |line.contains(".png") ){
	               spaces=line.length()-line.trim().length();
	           }
	           if(spaces> line.length()-line.trim().length() ){
	               sum+=line.trim().length()+1;
	               spaces--;
	           }
	       }
	       return sum;
	}
	

}
