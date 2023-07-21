package com.km.Assementdemo;

import java.time.LocalDate;

public class traveller 
{
	String TravellerName;
	int MobileNumber;
	String TravellerEmail;
	String FlightId;
	LocalDate Date;
	
	public traveller() {}
	public traveller(String TravellerName,int MobileNumber,String TravellerEmail,String FlightId,LocalDate Date)
	{
	
		TravellerName = TravellerEmail;
		MobileNumber = MobileNumber;
		TravellerEmail = TravellerEmail;
		FlightId = FlightId;
		Date = Date;
	}
	public String getTravellerName() {
		return TravellerName;
	}
	public void setTravellerName(String travellerName) {
		TravellerName = travellerName;
	}
	public int getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getTravellerEmail() {
		return TravellerEmail;
	}
	public void setTravellerEmail(String travellerEmail) {
		TravellerEmail = travellerEmail;
	}
	public String getFlightId() {
		return FlightId;
	}
	public void setFlightId(String flightId) {
		FlightId = flightId;
	}
	public LocalDate getDate() {
		return Date;
	}
	public void setDate(LocalDate date) {
		Date = date;
	}
	
	
}
