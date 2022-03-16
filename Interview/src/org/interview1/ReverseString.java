package org.interview1;

public class ReverseString {

	public static void main (String args[]) {
		String s = "WELCOME";
		String rev ="";
		for(int i =s.length()-1;i>=0;i--) {
			char c = s.charAt(i);
			rev = rev+c;
			
		}
		
	System.out.println(rev);	
	

	if(s.equals(rev)) {
		
		System.out.println("print paligram");
	}
	else {
		
		System.out.println("print not paligram");
	}
		
}
}