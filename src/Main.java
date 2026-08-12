//
//public class Practice {
//
//	 void Practice() {
//		System.out.println("Practice called");
//	}
//	static void Practice(Object o) {
//		System.out.println(o);
//	}
//	static void Practice(String s) {
//		System.out.println("String");
//	}
//   public static void main(String[]args) {
//	   Object[] arr=new Object[1];
//	   arr[0]=arr;
//	   System.out.println(arr[0]);
//	   
//   }
//}

class A{ 
	int x=10;
}
class B extends A{
	int x=20;
}
public class Main {
	public static void main(String[] args) {
		A obj=new B();
		System.out.println(obj.x);
		int []arr=new int[3];
		//arr[0]=10;
		System.out.println(arr[0]);
		
	}
}