package com.psl.bean;

public class Stock {

	private int stock_Id;
	private String product_Name;
	private String location;
	private String manager_Name;
	private int quantity;

	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Stock(int stock_Id, String product_Name, String location,
			String manager_Name, int quantity) {
		super();
		this.stock_Id = stock_Id;
		this.product_Name = product_Name;
		this.location = location;
		this.manager_Name = manager_Name;
		this.quantity = quantity;
	}

	public int getStock_Id() {
		return stock_Id;
	}

	public void setStock_Id(int stock_Id) {
		this.stock_Id = stock_Id;
	}

	public String getProduct_Name() {
		return product_Name;
	}

	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getManager_Name() {
		return manager_Name;
	}

	public void setManager_Name(String manager_Name) {
		this.manager_Name = manager_Name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Stock [stock_Id=" + stock_Id + ", product_Name=" + product_Name
				+ ", location=" + location + ", manager_Name=" + manager_Name
				+ ", quantity=" + quantity + "]";
	}

}
