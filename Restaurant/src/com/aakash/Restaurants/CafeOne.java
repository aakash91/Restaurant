package com.aakash.Restaurants;

import java.util.ArrayList;

import com.aakash.IRestaurants.IEmployee;
import com.aakash.IRestaurants.IRestaurant;
import com.aakash.Menu.Item;
import com.aakash.MenuHelper.Menu;

public class CafeOne implements IRestaurant{
	public String Name;
	public String Address;
	public ArrayList<IEmployee> employees=new ArrayList<>();
	public Menu menu;
	
	
	@Override
	public String getName() {
		
		return this.Name;
	}
	@Override
	public void setName(String name) {
		
		this.Name=name;
	}
	@Override
	public void setAddress(String address) {
		this.Address=address; 
		
	}
	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return this.Address;
	}
	@Override
	public int addEmployee(IEmployee e) {
		// TODO Auto-generated method stub
		this.employees.add(e);
		return employees.size();
	}
	
	@Override
	public IEmployee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return employees.get(id);
	}
	@Override
	public void getMenu() {
		// TODO Auto-generated method stub
		this.menu.printMenu();
	}
	@Override
	public void setMenu(Menu m) {
		// TODO Auto-generated method stub
		this.menu=m;
	}
}
