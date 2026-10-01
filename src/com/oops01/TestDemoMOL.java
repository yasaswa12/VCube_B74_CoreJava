package com.oops01;

class Emp{
	int sal=6000;
	void calcSal() {
		System.out.println("salary= "+sal);
	}
	void calcSal(double bonus) {
		
		System.out.println(sal+bonus+"=salary");
	}
}
class Dev extends Emp{
	@Override
	void calcSal() {
		System.out.println("salary= "+89);
	}
	@Override
	void calcSal(double bo) {
		System.out.println("salary= "+900+bo);
	}
	
}

public class TestDemoMOL {

	public static void main(String[] args) {
		Emp e1=new Emp();
		e1.calcSal();
		e1.calcSal(90);
		Dev d1=new Dev();
		d1.calcSal();
		d1.calcSal(78);
	}

}
