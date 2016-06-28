package com.psl.bean;

public class SignUp {

	
	private String first_Name;
	private String last_Name;
	private String email_Id;
	private String password;
	private String username;
	private String shopname;
	private String shoplocation;
	private String shopaddress;
	private String shopcontact;
	private String role;
	
	public SignUp() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}



	




	public String getFirst_Name() {
		return first_Name;
	}



	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}



	public String getLast_Name() {
		return last_Name;
	}



	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}



	public String getEmail_Id() {
		return email_Id;
	}



	public void setEmail_Id(String email_Id) {
		this.email_Id = email_Id;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getShopname() {
		return shopname;
	}



	public void setShopname(String shopname) {
		this.shopname = shopname;
	}



	public String getShoplocation() {
		return shoplocation;
	}



	public void setShoplocation(String shoplocation) {
		this.shoplocation = shoplocation;
	}



	public String getShopaddress() {
		return shopaddress;
	}



	public void setShopaddress(String shopaddress) {
		this.shopaddress = shopaddress;
	}



	public String getShopcontact() {
		return shopcontact;
	}



	public void setShopcontact(String shopcontact) {
		this.shopcontact = shopcontact;
	}



	@Override
	public String toString() {
		return "SignUp [first_Name=" + first_Name + ", last_Name=" + last_Name
				+ ", email_Id=" + email_Id + ", password=" + password
				+ ", username=" + username + ", shopname=" + shopname
				+ ", shoplocation=" + shoplocation + ", shopaddress="
				+ shopaddress + ", shopcontact=" + shopcontact + ", role="
				+ role + "]";
	}

	

}