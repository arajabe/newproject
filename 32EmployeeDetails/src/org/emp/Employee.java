package org.emp;

public class Employee {

	public void empId(){
	System.out.println("employee ID --- 1234");
	}
	public void empId(int a) {
		
		System.out.println ("Employee id Integer"+a);
	}
	public void empId(float b) {
		System.out.println("Employee id Float"+b);
	}
	public void empId(double c) {
		System.out.println("Employee id Double"+c);
	}
	public void empId(long d) {
		System.out.println("Employee Long"+d);
	}
	public void empId(char e) {
		System.out.println("Character"+e);
	}
	public void empId(String f) {
		System.out.println("Employee id String "+f);
	
	}
	public static void main(String args[]) {
		Employee g = new Employee();
		g.empId();
		g.empId(1234567);
		g.empId(1234.67823555);
		g.empId(1234.6782355);
		g.empId(12567);
		g.empId(1234567f);
		g.empId(1234567d);
		
	}
}
