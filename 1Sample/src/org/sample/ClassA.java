package org.sample;

import java.util.Scanner;

public interface  ClassA {

	default void mass() {
		int b = 10;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int c=sc.nextInt();
		System.out.println("Print Class A:"+c);
	
		
	}

	

}
