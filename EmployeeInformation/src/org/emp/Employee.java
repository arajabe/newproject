package org.emp;
 import org.company.Company;
 import org.client.Client;
 import org.project.Project;
 
public class Employee {

	private void empName() {
	System.out.println("empName");
	}
	public static void main(String args[]) {
		
		Employee a = new Employee();
		a.empName();
		Company b = new Company();
		b.companyName();
		Client c = new Client();
		c.clientName();
		Project d = new Project();
		d.projectName();
	}
	
}
