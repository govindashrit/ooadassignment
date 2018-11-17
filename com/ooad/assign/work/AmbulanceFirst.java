package com.ooad.assign.work;

import java.util.ArrayList;
import java.util.List;

/**
 * Ambulance first
 * 
 * @author Gov
 *
 */
public class AmbulanceFirst {

	protected List<Vehicle> vehicles = new ArrayList<Vehicle>();
	MessageModel model = new MessageModel();

	public void registerVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}

	public void deRegisterVehicle(Vehicle vehicle) {
		vehicles.remove(vehicle);
	}

	/**
	 * Create a new Trip with <code>vehicle</code>
	 * 
	 * @param vehicle
	 *            {@link Vehicle}
	 * @return {@link Trip}
	 */
	public Trip createTrip(Vehicle vehicle) {
		Trip trip = new Trip(vehicle);
		// Add more logic for trip
		return trip;
	}

	/**
	 * StartTrip
	 * 
	 * @param trip
	 *            trip
	 */
	void startTripService(Trip trip) {
		trip.start();
	}

	/**
	 * Stop Trip
	 * 
	 * @param trip
	 *            trip
	 */
	void stopTripService(Trip trip) {
		trip.complete();
	}

	/**
	 * Notifies the details of the trip Observable which notifies all the observers
	 * 
	 * @param trip
	 *            trip info
	 */
	void notifyDetails(Trip trip) {
		Vehicle vehicle = trip.getVehicle();
		String tripDetails = trip.getTripDetails();
		model.notifyListeners(vehicle, tripDetails);
	}

}
