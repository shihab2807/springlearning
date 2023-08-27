package com.jspiders.Spring.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	@Autowired
	private Product pr1;

	public Product getPr1() {
		return pr1;
	}

	public void setPr1(Product pr1) {
		this.pr1 = pr1;
	}

	public void productDetails() {
		pr1.setpId(101);
		pr1.setpName("MOBILE");
		pr1.setpPrice(18000);
		System.out.println("P-ID:"+pr1.getpId()+" P-NAME:"+pr1.getpName()+"P-PRICE:"+pr1.getpPrice());
	}

}
