package org.bike;

public class Ktm implements Bike{

	public void cost(){
		System.out.println("cost");
	}
	public void speed() {
		System.out.println("speed");
		
	}
	public static void main(String args[]) {
		
		Ktm a = new Ktm();
		a.cost();
		a.speed();
		
	}

}
