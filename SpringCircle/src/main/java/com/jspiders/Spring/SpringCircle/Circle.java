package com.jspiders.Spring.SpringCircle;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
@Repository
public class Circle {
	@Autowired
	private Area area_1;
//	private	Area area_2;
//	private Area area_3;
//	public Area getArea_3() {
//		return area_3;
//	}
//	public void setArea_3(Area area_3) {
//		this.area_3 = area_3;
//	}
	public Area getArea_1() {
		return area_1;
	}
	public void setArea_1(Area area_1) {
		this.area_1 = area_1;
	}
//	public Area getArea_2() {
//		return area_2;
//	}
//	public void setArea_2(Area area_2) {
//		this.area_2 = area_2;
//	}
//	List<Area> areas=new ArrayList<Area>();
//	public List<Area> getAreas() {
//		return areas;
//	}
//	public void setAreas(List<Area> areas) {
//		this.areas = areas;
//	}
	public void areaOfCircle() {
		
		area_1.setPi(3.14);
		area_1.setRadius(6);
		System.out.println("Area of Circle 1 is "+getArea_1().getPi()*getArea_1().getRadius()*getArea_1().getRadius());
//		System.out.println("Area of Circle 2 is "+getArea_2().getPi()*getArea_2().getRadius()*getArea_2().getRadius());
//		System.out.println("Area of Circle 3 is "+getArea_3().getPi()*getArea_3().getRadius()*getArea_3().getRadius());
		//	for(Area a:areas) {
		//		System.out.println("Area of circle is "+a.getPi()*a.getRadius()*a.getRadius());
		//	}







	}
}
