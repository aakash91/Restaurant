package com.aakash.Menu;

public class Item {
	public String Category;
	public String itemName;
//	public long itemValue;
	public int quantity;
	
	public Item(String Category, String itemName,long itemValue, int quantity) {
		this.Category=Category;
//		this.itemValue=itemValue;
		this.itemName=itemName;
		this.quantity=quantity;
	}
	
	
}
