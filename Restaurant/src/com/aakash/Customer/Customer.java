package com.aakash.Customer;

import com.aakash.IRestaurants.IRestaurant;
import com.aakash.Order.Order;

public class Customer {
	public String name;
	public String phone;
	public String address;
	public Order order;
	public IRestaurant restaurant;
	
	public Customer(String name,String phone, String address) {
		this.name=name;
		this.phone=phone;
		this.address=address;
		this.order=new Order();
	}
	
	public void setRestaurant(IRestaurant rest) {
		this.restaurant=rest;
	}
	
	public void placeOrder() {
		System.out.println("Order getting placed");
		this.restaurant.receiveOrder(this.order, this.name, this.phone, this.address);
	}
	
	public void addToOrder(String item,int qty) {
		if(this.restaurant.getMenu().containsKey(item)) {
			System.out.println("Added item:"+item+" to the order");
			this.order.addToOrder(item, qty);
			System.out.println("I am here");
		}else {
			System.out.println("Please add a valid order");
		}
	}
}
