package com.iu.Study5.t1;

public class Himart {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.setCompany("SAMSUNG");
		computer.setModelName("GRAM");
		computer.setCpu("I9");
		computer.setColor("WHITE");
		computer.setPrice(2000000);
		computer.setPoint(200);
		
		Tv tv = new Tv();
		tv.setCompany("LG");
		tv.setModelName("tv");
		tv.setInch(100);
		tv.setColor("BLACK");
		tv.setPrice(5000000);
		tv.setPoint(50);
	
		Phone phone = new Phone();
		phone.setCompany("APPLE");
		phone.setModelName("IPHONE15");
		phone.setColor("SKYBLUE");
		phone.setOs("IOS");
		phone.setPrice(500000);
		phone.setPoint(5);
		
		Product product = computer;
		product = tv;
		product = phone;
		
		Product [] products = new Product[3];
		products[0]=computer;
		products[1]=tv;
		products[2]=phone;
		
		Customer winter = new Customer();
		winter.buy(products);
		
		//2개
		
	}
}
