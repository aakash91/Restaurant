package com.aakash.IRestaurants;

public abstract class Employee {
	public int Id;
	public String name;
	public long salary;
	public String type;
	
	public void setId(int Id) {
	this.Id=Id;	
	}
	
	public int getId() {
		return this.Id;
	}
	
	public void setName(String Name) {
		this.name=Name;
	}
	
	public String getName() {
		return this.name;
	}
	public void setSalary(long Salary) {
		this.salary=Salary;
	}
	public long getSalary() {
		return this.salary;
	}
}
