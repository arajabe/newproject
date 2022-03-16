package org.addevennumber;

public class AddEvenNumber {

	public void addEvenNumber() {
		int i,j=0;
		for(i=1;i<=100;i++) {
			if(i%2==0) {
				j=i+j;
			}
			
		}
		System.out.println(j);
		
	}
	public static void main(String arg[]) {
		AddEvenNumber a = new AddEvenNumber();
		a.addEvenNumber();
		
		
	}

}
