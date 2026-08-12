package com.languagefundamentals;

public class ChoclateBuying {

	public static void main(String[] args) {
    int chocPr=18;
    int money=363;
    int choc=money/chocPr;
    int freechoc=choc/5;
    System.out.println("No of choclates you purchase=" + choc );
    System.out.println("Free chocos = "+ freechoc);
    System.out.println("Total chocos you get ="+ (choc+freechoc));
    System.out.println("Remainig amount="+(money%chocPr));
	}

}
