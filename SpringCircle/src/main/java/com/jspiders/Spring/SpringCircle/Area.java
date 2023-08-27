package com.jspiders.Spring.SpringCircle;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Area {
	private double pi;
	private int radius;
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}

}
