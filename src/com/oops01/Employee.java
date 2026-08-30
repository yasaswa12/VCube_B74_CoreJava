package com.oops01;

public class Employee {
	private int eid;
	private String ename;
	private double sal;
	public Employee(int eid, String ename, double sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + "]";
	}


	public Employee() {
		
	}


	public void setEid( int eid) {
		this.eid=eid;
	}
	public int getEid() {
		return eid;
	}
	public void setEname( String ename) {
		this.
	ename=ename;
	}
	public String getEname( ) {
		return ename;
	}
	public void setSalary( double sal) {
		this.sal=sal;
	}
	public double getSalary() {
		return sal;
	}
	

}
