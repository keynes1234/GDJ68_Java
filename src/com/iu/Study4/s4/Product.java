package com.iu.Study4.s4;

public class Product {
	public String name;
	public int price;
	
	public void setPrice(int price) {
		if(price<1) {
			this.price=1000;
		}
		this.price=price;
	}
	
	public int getPrice() {
		if(price<1) {
			this.price=1000;
		}
		return this.price;
	}
	
	public void info() {
		System.out.println(this.name);
	}
}
