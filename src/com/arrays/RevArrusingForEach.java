package com.arrays;

public class RevArrusingForEach {

	public static void main(String[] args) {
    int []arr= {10,20,30,40};
    int []rev = new int[arr.length];
    int i=arr.length-1;
    for(int x:arr) {
    	rev[i]=x;
    	i--;
    }
    for(int x:rev) {
    	System.out.println(x);
    }
	}

}
