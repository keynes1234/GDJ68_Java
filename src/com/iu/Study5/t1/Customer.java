package com.iu.Study5.t1;

public class Customer {
	/*
	Computer computer = new Computer();
	Tv tv = new Tv();
	Phone phone = new Phone();
	*/
	private int money;
	private int point;
	
	public Customer() {
		
		this.money=10000000;
		this.point=50;
		System.out.println("내 돈 : "+money);
		System.out.println("내 포인트 : "+point);
	}
	
	public void buy(Product product) {
	this.money = this.money-product.getPrice();
	this.point = this.point+product.getPoint();
	
	
	System.out.println("남은 돈 : "+money);
	System.out.println("내 포인트 : "+point);
	}
	public void buy(Product [] products) {
		for(int i=0;i<products.length;i++) {
			this.buy(products[i]);
		}
		
		
		System.out.println("남은 돈 : "+money);
		System.out.println("내 포인트 : "+point);
		}
}
