package org.interview1;

public class ReverseWords {

	public static void main(String args[]) {
		String s="Welcome Java";
		String sp[] = s.split("");
		String rev="";
		for (int i = sp.length-1; i>=0 ; i--) {
			String temp=sp[i];
			rev=rev+temp+"";
				}
System.out.println(rev);
	}

}
