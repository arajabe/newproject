package org.edu;

public class Education extends Arts{

	public void ugg()  {
		System.out.println("ug education");
	}
	public void pgg() {
		System.out.println("pg education");
	}
	
	public static void main(String arg[]) {
		
		Education a = new Education();
		a.ug();
		a.pg();
	}

}
