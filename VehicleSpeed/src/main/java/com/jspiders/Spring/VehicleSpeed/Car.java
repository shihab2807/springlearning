package com.jspiders.Spring.VehicleSpeed;

public class Car implements Vehicle {
	private Speed speed1;
	

	public Speed getSpeed1() {
		return speed1;
	}


	public void setSpeed1(Speed speed1) {
		this.speed1 = speed1;
	}


	@Override
	public void findTheSpeed() {
		System.out.println("Top speed of Car is "+speed1.getSpeed());
	}
}
