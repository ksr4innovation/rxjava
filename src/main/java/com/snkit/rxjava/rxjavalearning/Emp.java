package com.snkit.rxjava.rxjavalearning;

public class Emp {
	
	private String name;
	
	private String price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", price=" + price + "]";
	}
	
	

}
