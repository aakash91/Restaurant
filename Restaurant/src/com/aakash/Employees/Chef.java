package com.aakash.Employees;

import com.aakash.IRestaurants.IEmployee;

public class Chef implements IEmployee{
	public int Id;
	public String name;
	public long salary;
	public String type;
	
	@Override
	public void setId(int Id) {
		// TODO Auto-generated method stub
		this.Id=Id;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.Id;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSalary(long salary) {
		// TODO Auto-generated method stub
		this.salary=salary;
	}

	@Override
	public long getSalary() {
		// TODO Auto-generated method stub
		return this.salary;
	}

	@Override
	public void setType(String type) {
		// TODO Auto-generated method stub
		this.type=type;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.type;
	}

}
