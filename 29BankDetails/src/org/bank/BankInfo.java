package org.bank;

public class BankInfo extends AxisBank{

	public void saving() {
		System.out.println("saving(),fixed()");
	}
	public void fixed() {
		System.out.println("fixed()");
		
	}
	public static void main (String arg[]) {
		
	
	BankInfo c = new BankInfo();
	c.saving();
	c.fixed();
	c.deposit();
	
	}
}
