package com.springcore.Lifecycle;

public class solve {
	private  double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting price");
		this.price = price;
	}

	public solve() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "solve [price=" + price + "]";
	}
	
	public  void init() {
		System.out.println("Inside  init method");
	}
	
	public  void destroy() {
		System.out.println("Inside  destroy method");
	}
	

}
