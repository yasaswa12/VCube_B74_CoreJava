package com.oops01.ploymorphism;

public class TestMOL6 {

	public void main(String[] args) {
       System.out.println("main method started");
       int []arr= {1,2,3};
       char []ch= {'a','n'};
//       add(ch);
       
       add(arr);
       add(10);
       add(10,20);
	}

	 void add(int ...a) {
		int sum=0;
		for(int a1:a) {
			sum+=a1;
		}
		System.out.println(sum);
	}
//	 final void add(int i) {
//		System.out.println("one arg");
//	}
//	void add(int a,int b) {
//		System.out.println(a+b);
//	}
//	void add(float f) {
//		System.out.println("float");
//	}

}
