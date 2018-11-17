package com.ooad.assign.work;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/**
 * Message Model to hold listeners
 * @author Gov
 *
 */
public class MessageModel {

	private Set<MessageListener> listeners = ConcurrentHashMap.newKeySet();

	public Set<MessageListener> getListeners() {
		return listeners;
	}

	/**
	 * Adds new Message Listener
	 * 
	 * @param listener
	 */
	public void addMessageListener(MessageListener listener) {
		this.listeners.add(listener);
	}

	/**
	 * Remove new Message Listener
	 * 
	 * @param listener
	 */

	public void removedMessageListener(MessageListener listener) {
		this.listeners.remove(listener);
	}

	/**
	 * Will be called by Ambulance First application
	 * 
	 * @param vehicle
	 *            vehicle
	 * @param messageDetails
	 *            message details
	 */
	public void notifyListeners(Vehicle vehicle, String messageDetails) {
		listeners.forEach((MessageListener l) -> {
			l.notifiyMessage(vehicle.getCoordinate(), messageDetails);
		});
	}

}
