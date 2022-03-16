package org.printecenumber;

public class PrintEvenNumber {

	public void printEvenNumber() {
		int i;
		for (i=1; i<=100; i++){
		if (i%2==0) {
			System.out.println(i);
	
		}
	}
	}
	public static void main(String args[]) {
		PrintEvenNumber a = new PrintEvenNumber();
		System.out.println("Print Evennumber ");
		a.printEvenNumber();
		
		
	}

}
