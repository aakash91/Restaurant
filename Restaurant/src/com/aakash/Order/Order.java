package com.aakash.Order;

import java.util.ArrayList;
import java.util.HashMap;

import com.aakash.Menu.Item;

public class Order {
	HashMap<String,Integer> order=new HashMap<>();
	
	public void addToOrder(String item, int qty) {
		this.order.put(item, qty);
	}
}
