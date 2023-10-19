package com.example.demo.part1;

public class Item {

	
	 
	public int itemId;
	public String itemdesc;
	public double price;
	public String brand;
	
	public Item(int itemId, String itemdesc, double price, String brand) {
		super();
		this.itemId = itemId;
		this.itemdesc = itemdesc;
		this.price = price;
		this.brand = brand;
	}
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemdesc() {
		return itemdesc;
	}
	public void setItemdesc(String itemdesc) {
		this.itemdesc = itemdesc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemdesc=" + itemdesc + ", price=" + price + ", brand=" + brand + "]";
	}
	
	
	
}
