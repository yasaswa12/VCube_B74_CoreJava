package com.arrays;

public class MaxProfit {

	public static void main(String[] args) {

		int []arr= {7,1,5,6,3,4};
		int buy = arr[0];
		int sell=arr[0];
		int minPrice=arr[0];
		int maxProfit=0;
		for(int i = 0;i < arr.length;i++) {
			if(arr[i]<minPrice) {
				minPrice=arr[i];
			}else if(arr[i]-minPrice > maxProfit) {
				maxProfit=arr[i]-minPrice;
				sell=arr[i];
				buy=minPrice;
			}
		}
		
//		int maxProfit=Integer.MIN_VALUE; 
//		int buy=0;
//		int sell=0;
//		int profit=0;
//		for(int i = 0;i<arr.length ; i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				profit=arr[j]-arr[i];
//				if(profit>maxProfit) {
//					buy=arr[i];
//					sell=arr[j];
//					maxProfit=profit;
//				}
//			}
//		}
		System.out.println("buy: " + buy);
		System.out.println("sell: " + sell);
		System.out.println("maxprofit: "+ maxProfit);
	}

}
