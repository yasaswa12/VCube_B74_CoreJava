package com.arrays;

public class Arr3DInitilization {

	public static void main(String[] args) {

		int[][][]arr= {{{10,20},{0,0}},{{0,0},{30,40},{0,0}},{{0,0},{},{50,60}}};
		for(int [][]a1 : arr) {
			for(int []a2:a1) {
				for(int a: a2) {
					System.out.print(a + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
