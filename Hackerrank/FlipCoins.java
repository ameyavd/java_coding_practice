package com.ameya.hackerrank;

public class FlipCoins {

	public static void main(String[] args) {
			/*int coinCount = 5;
		        String result = " ";
		        for (int i=0; i< coinCount ; ++i){
		           int res =  (Math.random()<0.5)?0:1;
		           if(res == 0) {
		               result = result + " " + "T" + " ";
		           } else {
		               result = result + " " + "H" + " ";
		           }
		        }

		        System.out.print(result);*/
		    //    return result;
		    
		FlipCoins f = new FlipCoins();
		int[] a = {1,2,3,5,6,8,6,4,2,4,6,7};
	//	System.out.println(f.process(3, a));
		int[]dude = {1,2,3,4,5};
		f.triple(dude);

	}
	
	public int process(int k, int a[]){
		if(k<a.length){
			int i = a[k] + process(k+2,a);
			System.out.println(i);
			return i;
		}
		else {
			return 0;
		}
	}
	
	public static int[] helper(int []a){
		int x = 0;
		if(x < a.length){
			a[x] = a[x] *3;
			x++;
			 
		}
		return helper(a);
		
	}
	
	public void triple(int dude[]){
		
		dude = helper(dude);
		for(int l:dude){
			System.out.println(dude[l]);
		}
	}

}


