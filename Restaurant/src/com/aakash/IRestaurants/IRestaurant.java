package com.aakash.IRestaurants;

import java.util.ArrayList;

import com.aakash.Menu.Item;
import com.aakash.MenuHelper.Menu;

public interface IRestaurant {
	public String getName();
	public void setName(String name);
	public void setAddress(String address);
	public String getAddress();
	public int addEmployee(IEmployee e);
	public IEmployee getEmployeeById(int id);
	public void getMenu();
	public void setMenu(Menu m);
}
