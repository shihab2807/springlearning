package com.jspiders.Spring.AutoWireByType;

import java.util.ArrayList;
import java.util.List;

public class Vehicles1 {

	private List<CarBrand> l=new ArrayList<CarBrand>();

	public void setL(List<CarBrand> l) {
		this.l = l;
	}

	public List<CarBrand> getL() {
		return l;
	}
	public void showBrand() {

		for(CarBrand c:l) {
			System.out.println("Car Brand is "+c.getBrand());
		}
	}
}
