package com.order.address;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "address")
public class Address {
	
	public String profileId;
	public	String fullName;
	public long mobileNumber;
	public int houseNo;
	public String streetName;
	
	public String city;
	public String state;
	
	
	
	public Address () {
		
	}



	public Address(String profileId, String fullName, long mobileNumber, int houseNo, String streetName, String city,
			String state) {
		super();
		this.profileId = profileId;
		this.fullName = fullName;
		this.mobileNumber = mobileNumber;
		this.houseNo = houseNo;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
	}



	public String getProfileId() {
		return profileId;
	}



	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}



	public String getFullName() {
		return fullName;
	}



	public void setFullName(String fullName) {
		this.fullName = fullName;
	}



	public long getMobileNumber() {
		return mobileNumber;
	}



	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}



	public int getHouseNo() {
		return houseNo;
	}



	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}



	public String getStreetName() {
		return streetName;
	}



	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	@Override
	public String toString() {
		return "Address [profileId=" + profileId + ", fullName=" + fullName + ", mobileNumber=" + mobileNumber
				+ ", houseNo=" + houseNo + ", streetName=" + streetName + ", city=" + city + ", state=" + state + "]";
	}


	
	
}
