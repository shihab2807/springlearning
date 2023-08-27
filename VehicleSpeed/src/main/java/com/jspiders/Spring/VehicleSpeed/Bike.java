package com.jspiders.Spring.VehicleSpeed;

public class Bike implements Vehicle {
	private Speed speed2;
	
	
	public Speed getSpeed2() {
		return speed2;
	}


	public void setSpeed2(Speed speed2) {
		this.speed2 = speed2;
	}


	@Override
	public void findTheSpeed() {
		System.out.println("Top speed of Bike is "+speed2.getSpeed());
	}
}
