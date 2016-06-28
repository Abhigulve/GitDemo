package com.psl.bean;

public class PurchaserOrder {

	private int order_Id;
	private String user_Name;
	private String product_Name;
	private int quantity;
	private double tot_Amount;
	private String status;

	public PurchaserOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PurchaserOrder(int order_Id, String user_Name, String product_Name,
			int quantity, double tot_Amount, String status) {
		super();
		this.order_Id = order_Id;
		this.user_Name = user_Name;
		this.product_Name = product_Name;
		this.quantity = quantity;
		this.tot_Amount = tot_Amount;
		this.status = status;
	}

	public int getOrder_Id() {
		return order_Id;
	}

	public void setOrder_Id(int order_Id) {
		this.order_Id = order_Id;
	}

	public String getUser_Name() {
		return user_Name;
	}

	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
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

	public double getTot_Amount() {
		return tot_Amount;
	}

	public void setTot_Amount(double tot_Amount) {
		this.tot_Amount = tot_Amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "PurchaserOrder [order_Id=" + order_Id + ", user_Name="
				+ user_Name + ", product_Name=" + product_Name + ", quantity="
				+ quantity + ", tot_Amount=" + tot_Amount + ", status="
				+ status + "]";
	}

}
