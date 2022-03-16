package org.company;

import org.client.Client;

public class Company extends Client{

	public void companyName(){
		System.out.println("companyName()");
	}
	
	public static void main(String args[]) {
		 
		Company a = new Company();
		a.companyName();
		a.clientName();
	}

}
