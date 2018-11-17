package com.ooad.assign.work;

/**
 * Trip class
 * 
 * @author Gov
 *
 */
public class Trip {

	Vehicle vehicle;

	String tripDetails;

	public Trip(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void start() {
		// Add trip start logic
	}

	public void complete() {
		// Add trip completion logic
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public String getTripDetails() {
		return tripDetails;
	}

	public void setTripDetails(String tripDetails) {
		this.tripDetails = tripDetails;
	}

}
