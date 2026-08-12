package com.languagefundamentals.methods;

public class OnlineShopping {

	public static void main(String[] args) {
		//Online shopping
    int orderAm=699;
    if(orderAm>=499) {
    	System.out.println("Your order amount is greter than 499 .so you are eligible for free shipping");
    }else {
    	System.out.println("Not eligible for free shiping");
    }
    
    //College Admission
    double percentage=80.;
    boolean isEligible=(percentage>75.0)? true: false;
    System.out.println("Is Eligible for scholarship ?"+ isEligible);
    
    int age=10;
    if(age<12) {
    	System.out.println("Eligible for child ticket");
    }else {
    	System.out.println("Not eligible for cild ticket");
    }
    
    //4
    int bal=100;
     if( bal>=1000 ) System.out.println("Your bank balance is greater than min bal");
     else
      System.out.println("less than min Balance");
	}

}
