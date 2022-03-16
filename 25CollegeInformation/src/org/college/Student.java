package org.college;

public class Student extends College{

	public void studentName(){
		System.out.println("studentName()");
	}
	public void studentDept() {
		System.out.println("studentDept()");
	}
	public void studentId() {
		System.out.println("studentId()");
	}
	
	public static void main(String args[]) {
		
		Student a = new Student();
		a.collegeName();
		a.collegeCode();
		a.collegeRank();
		a.studentName();
		a.studentDept();
		a.studentId();
		a.HostelName();
		a.deptName();
	}
}
