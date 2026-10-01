package com.oops01;

class Course {
	int duration = 6;

	void duration() {
		System.out.println(duration);
	}
}

class JavaCourse extends Course {
	{
	super.duration = 12;
	}
	@Override
	void duration() {
		System.out.println(duration);
	}
}

class PythonCourse extends Course {
	{
		super.duration=8;
	}
	@Override
	void duration() {
		System.out.println(duration);
	}
}

public class TestDemo123 {

	public static void main(String[] args) {
		
		PythonCourse py=new PythonCourse();
		py.duration();
	}

}
