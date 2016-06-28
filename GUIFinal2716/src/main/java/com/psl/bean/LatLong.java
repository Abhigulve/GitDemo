package com.psl.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class LatLong {
	
	private String customerId;
	private double latitude;
	private double longitude;

	public LatLong() {
		// TODO Auto-generated constructor stub
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "LatLong [clientId=" + customerId + ", latitude=" + latitude
				+ ", longitude=" + longitude + "]";
	}
}
