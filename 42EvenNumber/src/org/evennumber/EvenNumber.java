package org.evennumber;

import java.util.Scanner;

public class EvenNumber {

	public  void  evennumber  (int b ) {	
			
		if(b%2 == 0) {
			
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
		}
	public static void main(String args[]) {
		
EvenNumber even = new EvenNumber();
	Scanner sc = new Scanner(System.in);
System.out.println("Enter Number to Find ");
    even.evennumber(sc.nextInt());


	}

}	

