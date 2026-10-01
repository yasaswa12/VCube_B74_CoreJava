package com.recursion;
import java.util.ArrayList;
import java.util.List;
public class PermutationNum {
//	static void permutation(int[]num,List<Integer> ds,List<List<Integer>> ans,boolean[]freq) {
//		if(ds.size()==num.length) {
//			ans.add(new ArrayList<>(ds));
//			return;
//		}
//		for(int i=0;i<num.length;i++) {
//			if(!freq[i]) {
//				ds.add(num[i]);
//				freq[i]=true;
//				permutation(num,ds,ans,freq);
//				ds.remove(ds.size()-1);
//				freq[i]=false;
//			}
//		}
//			
//	}

	static void permutation(int index,int[]nums,List<List<Integer>> ans) {
		if(index==nums.length) {
			List<Integer>ds=new ArrayList<>();
			for(int i=0;i<nums.length;i++) {
				ds.add(nums[i]);
			}
			ans.add(ds);
			return;
		}
		for(int i=index;i<nums.length;i++) {
			swap(i,index,nums);
			permutation(index+1,nums,ans);
			swap(i,index,nums);
		}
	}
	private static void swap(int i, int index, int[] nums) {
		int temp=nums[i];
		nums[i]=nums[index];
		nums[index]=temp;
	}
	public static void main(String[] args) {
		int[]nums= {1,2,3};
		List<Integer>ds=new ArrayList<>();
		List<List<Integer>> ans=new ArrayList<>();
		boolean []freq=new boolean[nums.length];
		//permutation(nums,ds,ans,freq);
 		permutation(0,nums,ans);
		
	}

}
