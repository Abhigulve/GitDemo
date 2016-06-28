package com.psl.bean;

public class Driver {

	private String driver_Id;
	private String driver_Name;
	private String vehicle_No;
	private String contact_No;

	public Driver(String driver_Id, String driver_Name, String vehicle_No,
			String contact_No) {
		super();
		this.driver_Id = driver_Id;
		this.driver_Name = driver_Name;
		this.vehicle_No = vehicle_No;
		this.contact_No = contact_No;
	}

	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDriver_Id() {
		return driver_Id;
	}

	public void setDriver_Id(String driver_Id) {
		this.driver_Id = driver_Id;
	}

	public String getDriver_Name() {
		return driver_Name;
	}

	public void setDriver_Name(String driver_Name) {
		this.driver_Name = driver_Name;
	}

	public String getVehicle_No() {
		return vehicle_No;
	}

	public void setVehicle_No(String vehicle_No) {
		this.vehicle_No = vehicle_No;
	}

	public String getContact_No() {
		return contact_No;
	}

	public void setContact_No(String contact_No) {
		this.contact_No = contact_No;
	}

	@Override
	public String toString() {
		return "Driver [driver_Id=" + driver_Id + ", driver_Name="
				+ driver_Name + ", vehicle_No=" + vehicle_No + ", contact_No="
				+ contact_No + "]";
	}

}
