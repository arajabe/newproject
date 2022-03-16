package org.emp;

public class Employee {

	private void empId() {
		System.out.println("empID");
	}
	private void empName() {
		System.out.println("empName");
		
	}
	private void empDob() {
		System.out.println("empDob");
		
	}
	private void empPhone() {
		System.out.println("empPhone");
		
	}
	private void empMail() {
		System.out.println("empMail");
		
	}
	private void empAddress() {
		System.out.println("empAddress");
	}
	public static void main (String args []) {
		
		Employee C = new Employee();
		C.empId();
		C.empName();
		C.empMail();
		C.empDob();
		C.empPhone();
		C.empAddress();
	}

}
