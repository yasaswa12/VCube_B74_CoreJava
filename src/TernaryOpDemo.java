
public class TernaryOpDemo {

	public static void main(String[] args) {
//WAL for vote
		int age=20;
		boolean isEligible=(age>18) ? true: false;
		System.out.println("The given age is eligible ? .."+ isEligible);
		int age1=42;
		String eligibility=(age>18)? "yes":"No";
		System.out.println("eligible:"+eligibility);
		for(int a=5;a<10;a++) {
			System.out.println("error");
		}
	}

}
