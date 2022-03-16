package org.palindroms;
import java.util.Scanner;
public class Palindroms {
	public void palindroms() {
	
	}
	public static void main(String args[]) {
		System.out.println("Enter Number");
		Scanner  in = new Scanner(System.in);
		String number = in.nextLine();
		int x = number.length();
		char b[] = new char[x];
		char c[] = new char[x];
		for(int i=0;i<x;i++)
		{
		b[i]= number.charAt(i);
		c[x-1-i]=b[i];
		}
		for (int i=0;i<x;i++) {
			if(b[i]!=c[i]) {
				System.out.println("The given number Not Plaindroms");
				break;
							}
			System.out.println("The given number Plaindroms");
			break;
			}
		}
}


