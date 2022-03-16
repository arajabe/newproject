package org.transport;

import org.road.Road;
import org.air.Air;
import org.water.Water;

public class Transport {

	public void TransportForm() {
		System.out.println("TransportForm");
	}
	public static void main(String args[]) {
		Transport a = new Transport();
		a.TransportForm();
		Road b = new Road();
		b.bike();
		b.cycle();
		b.bus();
		b.car();
		Air c = new Air();
		c.aeroPlane();
		c.heliCopter();
		Water d = new Water();
		d.boat();
		d.ship();
		
	}

}
