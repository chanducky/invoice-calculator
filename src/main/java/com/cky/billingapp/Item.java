package com.cky.billingapp;

/**
 * @author chandrakumar
 *
 */
public class Item {
	String name;
	double price;
	int qty;
	
	public Item( int qty, String name, double price) {
		super();
		this.name = name;
		this.price = price;
		this.qty = qty;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + ", qty=" + qty + "]";
	}
	
	
}
