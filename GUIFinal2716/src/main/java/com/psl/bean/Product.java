package com.psl.bean;

import java.util.Date;

public class Product {

	private int product_Id;
	private String product_Name;
	private int quantity;
	private String user_Name;
	private Date mfg_Date;
	private Date expiry_Date;
	private double price;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int product_Id, String product_Name, int quantity,
			String user_Name, Date mfg_Date, Date expiry_Date, double price) {
		super();
		this.product_Id = product_Id;
		this.product_Name = product_Name;
		this.quantity = quantity;
		this.user_Name = user_Name;
		this.mfg_Date = mfg_Date;
		this.expiry_Date = expiry_Date;
		this.price = price;
	}

	public int getProduct_Id() {
		return product_Id;
	}

	public void setProduct_Id(int product_Id) {
		this.product_Id = product_Id;
	}

	public String getProduct_Name() {
		return product_Name;
	}

	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getUser_Name() {
		return user_Name;
	}

	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}

	public Date getMfg_Date() {
		return mfg_Date;
	}

	public void setMfg_Date(Date mfg_Date) {
		this.mfg_Date = mfg_Date;
	}

	public Date getExpiry_Date() {
		return expiry_Date;
	}

	public void setExpiry_Date(Date expiry_Date) {
		this.expiry_Date = expiry_Date;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [product_Id=" + product_Id + ", product_Name="
				+ product_Name + ", quantity=" + quantity + ", user_Name="
				+ user_Name + ", mfg_Date=" + mfg_Date + ", expiry_Date="
				+ expiry_Date + ", price=" + price + "]";
	}

	
}
