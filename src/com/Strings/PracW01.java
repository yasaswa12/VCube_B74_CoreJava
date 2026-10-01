package com.Strings;

public class PracW01 {

	public static void main(String[] args) {
		String email=" yasaswa95@Gmail . com ";
			System.out.println(email);
		email=email.trim().toLowerCase().replace(" ", "");
		System.out.println("Email= "+email);
		
		if(email.contains("@") && email.endsWith(".com")) {
			System.out.println("Valid email");
		}else {
			System.err.println("Invalid Email");
		}
		
		
		String fName=email.substring(0,email.indexOf("@"));
		System.out.println("firstName= "+fName);
		
	}

}
