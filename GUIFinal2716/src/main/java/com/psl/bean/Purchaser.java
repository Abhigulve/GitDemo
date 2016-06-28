package com.psl.bean;

public class Purchaser {

	private String purchaser_Id;
	private String purchaser_Name;
	private String shop_Name;
	private String shop_Location;
	private String contact_No;
	private String address;

	public Purchaser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Purchaser(String purchaser_Id, String purchaser_Name,
			String shop_Name, String shop_Location, String contact_No,
			String address) {
		super();
		this.purchaser_Id = purchaser_Id;
		this.purchaser_Name = purchaser_Name;
		this.shop_Name = shop_Name;
		this.shop_Location = shop_Location;
		this.contact_No = contact_No;
		this.address = address;
	}

	public String getPurchaser_Id() {
		return purchaser_Id;
	}

	public void setPurchaser_Id(String purchaser_Id) {
		this.purchaser_Id = purchaser_Id;
	}

	public String getPurchaser_Name() {
		return purchaser_Name;
	}

	public void setPurchaser_Name(String purchaser_Name) {
		this.purchaser_Name = purchaser_Name;
	}

	public String getShop_Name() {
		return shop_Name;
	}

	public void setShop_Name(String shop_Name) {
		this.shop_Name = shop_Name;
	}

	public String getShop_Location() {
		return shop_Location;
	}

	public void setShop_Location(String shop_Location) {
		this.shop_Location = shop_Location;
	}

	public String getContact_No() {
		return contact_No;
	}

	public void setContact_No(String contact_No) {
		this.contact_No = contact_No;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Purchaser [purchaser_Id=" + purchaser_Id + ", purchaser_Name="
				+ purchaser_Name + ", shop_Name=" + shop_Name
				+ ", shop_Location=" + shop_Location + ", contact_No="
				+ contact_No + ", address=" + address + "]";
	}

}
