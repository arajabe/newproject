package org.college;

public class College {

	public void  collegeName(){
		System.out.println("collegeName");
		}
	public void collegeCode() {
	System.out.println("collegeCode");	
	}
	public void collegeRank() {
		System.out.println("collegeRank");
		}
public static void main(String args[]) {
	College a = new College();
	a.collegeName();
	a.collegeCode();
	a.collegeRank();
	Student b = new Student();
	b.studentName();
	b.studentDept();
	b.studentId();
	Hostel c = new Hostel();
	c.hostelName();
	Dept d = new Dept();
	d.deptName();
}
}
