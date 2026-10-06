package com.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp implements Serializable{

	//private static final long serialVersionUID = 1L;
	String name="yasaswa";
	transient String password="yasaswa@1234";
	int age=22;
	
	@Override
	public String toString() {
		return "Emp [name=" + name + ", password=" + password + ", age=" + age + "]";
	}
	
}

public class SerializationDemo {

	public static void main(String[] args) throws IOException   {
		System.out.println("main method started");
		Emp e=new Emp();
		
		File f=new File("C:\\Users\\yash\\WORKSPACE\\corejavaworkspace\\files\\sr.txt");
		
			FileOutputStream fos=new FileOutputStream(f);
			ObjectOutputStream oom=new ObjectOutputStream(fos);
			oom.writeObject(e);
		
		
		System.out.println("main method ended");
	}

}
