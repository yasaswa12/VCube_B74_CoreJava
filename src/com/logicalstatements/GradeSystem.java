package com.logicalstatements;

import java.util.Scanner;

public class GradeSystem {

	public static void main(String[] args) {
      
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks of 5 subjects");
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		int s3=sc.nextInt();
		int s4=sc.nextInt();
		int s5=sc.nextInt();
		
		int total=s1+s2+s3+s4+s5;
		
		float perc=total/5.0f;
	 System.out.println("Total marks: "+ total);
	  System.out.println("Percentage:" + perc);
			
		if(perc >= 90) {
			System.out.println("Grade A");
		}else if(perc >= 75) {
			System.out.println("Grade B");
		}else if(perc >= 60) {
			System.out.println("Grade C");
		}else if(perc >= 40) {
			System.out.println("Grade D");
		}else if(perc < 40) {
			System.out.println("Grade F");
		}else {
			System.out.println("Invalid");
		}
		sc.close();
	}

}
