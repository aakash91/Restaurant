package com.aakash.MenuHelper;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.aakash.Menu.Item;

public class Menu {
	
	//public HashMap<Item,Object> items=new HashMap<Item,Object>();
	public HashMap<String,Item> items=new HashMap<String,Item>();
	
	public void AddToMenu(String itemName, Item item) {
		items.put(itemName, item);
	}
	
	public HashMap<String,Item> printMenu() {
		return items;
		
	}
	
	
	
}
