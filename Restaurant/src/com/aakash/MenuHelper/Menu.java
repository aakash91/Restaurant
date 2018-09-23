package com.aakash.MenuHelper;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.aakash.Menu.Item;

public class Menu {
	
	public HashMap<Item,Object> items=new HashMap<Item,Object>();
	
	public void AddToMenu(Item item, long value) {
		items.put(item, value);
	}
	
	public void printMenu() {
		items.forEach((key,value) -> System.out.println(key.itemName + " = " + value));
		
	}
	
}
