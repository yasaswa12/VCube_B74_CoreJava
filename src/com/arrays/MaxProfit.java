package com.arrays;

public class MaxProfit {

	public static void main(String[] args) {

		int []arr= {7,6,6};
		int maxProfit=Integer.MIN_VALUE; 
		int buy=0;
		int sell=0;
		int profit=0;
		for(int i = 0;i<arr.length ; i++) {
			for(int j=0;j<arr.length;j++) {
				profit=arr[j]-arr[i];
				if(profit>maxProfit) {
					buy=arr[i];
					sell=arr[j];
					maxProfit=profit;
				}
			}
		}
		System.out.println("buy: " + buy);
		System.out.println("sell: " + sell);
		System.out.println("maxprofit: "+ maxProfit);
	}

}
