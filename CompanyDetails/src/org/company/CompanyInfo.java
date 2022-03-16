package org.company;
public class CompanyInfo {

	private void companyName() {
		System.out.println("companyName");
		
	}
	private void companyId() {
		System.out.println("companyId");
		
	}
	private void companyAddress() {
		System.out.println("companyAddress");
		
	}
	public static void main(String args[]) {
		
		CompanyInfo c = new CompanyInfo();
		c.companyName();
		c.companyId();
		c.companyAddress();
	}	

}
