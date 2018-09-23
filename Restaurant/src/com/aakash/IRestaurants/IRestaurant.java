package com.aakash.IRestaurants;

import java.util.HashMap;

import com.aakash.Menu.Item;
import com.aakash.MenuHelper.Menu;
import com.aakash.Order.Order;

public interface IRestaurant {
	public String getName();
	public void setName(String name);
	public void setAddress(String address);
	public String getAddress();
	public int addEmployee(IEmployee e);
	public IEmployee getEmployeeById(int id);
	public HashMap<String,Item> getMenu();
	public void setMenu(Menu m);
	public void receiveOrder(Order o,String custName,String custNumber,String custAdress);
}
