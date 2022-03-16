package org.addoddnumber;

public class AddOddNumber {

	public void addOddNumber() {
		int i,j=0;
			for (i= 1; i<=100; i++) {
			if (i%2!=0) {
				j=j+i;
			}
					}
		System.out.println(j);
	}
	public static void main(String args[]) {
		AddOddNumber a = new AddOddNumber();
		a.addOddNumber();
		
		
	}

}
