package org.phone;

public class InternalStorage {

	public void processorName() {
		System.out.println("processorName");
	}
	
	public void ramSize() {
		System.out.println("ramSize");
		
	}
	
	public static void main(String args[]) {
		
		ExternalStorage a = new ExternalStorage();
		InternalStorage b = new InternalStorage();
		a.size();
		b.processorName();
		b.ramSize();
		
	}

}
