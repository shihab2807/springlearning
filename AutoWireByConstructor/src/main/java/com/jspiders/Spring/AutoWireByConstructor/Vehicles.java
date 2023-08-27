package com.jspiders.Spring.AutoWireByConstructor;


public class Vehicles {
	private CarBrand c1;
	private CarBrand c2;
	
	public Vehicles(CarBrand c1,CarBrand c2) {
		
		this.c1 = c1;
		this.c2 = c2;
	}
	public CarBrand getC1() {
		return c1;
	}
//	public void setC1(CarBrand c1) {
//		this.c1 = c1;
//	}
	public CarBrand getC2() {
		return c2;
	}
//	public void setC2(CarBrand c2) {
//		this.c2 = c2;
//	}

	public void showBrand() {
		System.out.println("Car Brand is "+getC1().getBrand());
		System.out.println("Car Brand is "+getC2().getBrand());
	}
}
