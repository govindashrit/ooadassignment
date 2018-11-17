package com.ooad.assign.work;
/**
 * Traffic Police Observer
 * @author Gov
 *
 */
public class TrafficPolice implements MessageListener {

	@Override
	public boolean notifiyMessage(Coordinate coordinate, String message) {
		System.out.println("Ambulance located at Latitude " + coordinate.getLatitude() + " Longitude :"
				+ coordinate.getLongitude());
		System.out.println("Trip Details "+ message); 
		// True / false based on further check
		return true;
	}

}
