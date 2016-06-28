package com.psl.bean;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class Supplier {

	private int supplier_Id;
	private String supplier_Name;
	private String address;
	private String contact_No;
	private String company_Name;
	@OneToMany
	@JoinColumn(name = "supplier_Id")
	private Set<Stock> stock = new HashSet<Stock>();
	@OneToMany
	@JoinColumn(name = "supplier_Id")
	private Set<Driver> driver = new HashSet<Driver>();
	
	
	public Supplier(int supplier_Id, String supplier_Name, String address,
			String contact_No, String company_Name, Set<Stock> stock,
			Set<Driver> driver) {
		super();
		this.supplier_Id = supplier_Id;
		this.supplier_Name = supplier_Name;
		this.address = address;
		this.contact_No = contact_No;
		this.company_Name = company_Name;
		this.stock = stock;
		this.driver = driver;
	}


	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getSupplier_Id() {
		return supplier_Id;
	}


	public void setSupplier_Id(int supplier_Id) {
		this.supplier_Id = supplier_Id;
	}


	public String getSupplier_Name() {
		return supplier_Name;
	}


	public void setSupplier_Name(String supplier_Name) {
		this.supplier_Name = supplier_Name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getContact_No() {
		return contact_No;
	}


	public void setContact_No(String contact_No) {
		this.contact_No = contact_No;
	}


	public String getCompany_Name() {
		return company_Name;
	}


	public void setCompany_Name(String company_Name) {
		this.company_Name = company_Name;
	}


	public Set<Stock> getStock() {
		return stock;
	}


	public void setStock(Set<Stock> stock) {
		this.stock = stock;
	}


	public Set<Driver> getDriver() {
		return driver;
	}


	public void setDriver(Set<Driver> driver) {
		this.driver = driver;
	}


	@Override
	public String toString() {
		return "Supplier [supplier_Id=" + supplier_Id + ", supplier_Name="
				+ supplier_Name + ", address=" + address + ", contact_No="
				+ contact_No + ", company_Name=" + company_Name + ", stock="
				+ stock + ", driver=" + driver + "]";
	}

	
	
}
