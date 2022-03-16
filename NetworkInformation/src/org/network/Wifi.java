package org.network;

public class Wifi {

	public void wifiName() {
		System.out.println("wifiName()");
	}
	public static void main(String args[]) {
		Wifi a = new Wifi();
		a.wifiName();
		MobileData b = new MobileData();
		b.dataName();
		Lan c = new Lan();
		c.lanName();
		Wireless d = new Wireless();
		d.modamName();
	}

}
